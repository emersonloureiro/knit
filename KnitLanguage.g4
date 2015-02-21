grammar KnitLanguage;

@members {
    private boolean skipSpace = true;
}

knitProgram:            function* mainFunction function*;
function:               FUNCTION_KEYWORD identifier('('((parameter',' )*parameter)?')')? functionBody;
mainFunction:           FUNCTION_KEYWORD MAIN_KEYWORD functionBody;
functionBody:			code;
parameter:  			identifier;
code:					programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:	variableDeclaration|systemFunctions|methodCall|commandExpression;
variableDeclaration:    identifier'='variableValue;
variableValue:          constant|commandExpression|complexMathExpression|booleanExpression;
number:                 ('-')?(DIGIT+)('.'DIGIT+)?;
argument:               constant|variableReference;
identifier:             IDENTIFIER;
systemFunctions:        print|assertion;
systemMethod:           listMethods;
listMethods:            foreach;
methodCall:             variableReference '.' systemMethod;
mathOperator:           ('+'|'-'|'*'|'/');
simpleMathExpression:   (number|variableReference) (mathOperator (number|variableReference))*;
enclosedMathExpression: ('(' simpleMathExpression (mathOperator enclosedMathExpression)* ')');
complexMathExpression:  (simpleMathExpression | enclosedMathExpression) (mathOperator (simpleMathExpression | enclosedMathExpression))*;
booleanExpression:      argument'=='argument;
constant:               number|STRING;
commandExpression:      plainCommand|asListCommand;
plainCommand:           COMMAND;
asListCommand:          COMMAND '.' 'asList' ('.'listMethods)?;
variableReference:      identifier;

// Embedded methods/functions
print:                  'print' '(' argument ')';
assertion:              'assert' '(' (booleanExpression|variableReference) ')';
foreach:                'foreach' '{' identifier '->' functionBody '}';

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [0-9];
SPACE:                  [' ']+ {if (skipSpace) skip();};
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
STRING:                 '"' ( ~('"') )* '"';
COMMAND:                '[' (.)*? ']';
IDENTIFIER:             {skipSpace = false;} ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT)* {skipSpace = true;};
COMMENT:                ('#' ~('\r'|'\n')*) -> channel(HIDDEN);