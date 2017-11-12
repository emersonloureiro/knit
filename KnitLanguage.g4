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
programmingConstruct:	variableDeclaration|systemFunctions|foreachDoExpression|commandExpression;
variableDeclaration:    identifier'='expression;
expression:             constant|commandExpression|variableReference|complexMathExpression|booleanExpression;
number:                 ('-')?(DIGIT+)('.'DIGIT+)?;
argument:               constant|variableReference;
identifier:             IDENTIFIER;
systemFunctions:        print|assertion;
foreachDoExpression:    FOR_KEYWORD identifier IN_KEYWORD (variableReference|listOutputCommand) DO_KEYWORD functionBody;
mathOperator:           ('+'|'-'|'*'|'/');
simpleMathExpression:   (number|variableReference) (mathOperator (number|variableReference))*;
enclosedMathExpression: ('(' simpleMathExpression (mathOperator enclosedMathExpression)* ')');
complexMathExpression:  (simpleMathExpression | enclosedMathExpression) (mathOperator (simpleMathExpression | enclosedMathExpression))*;
booleanExpression:      argument'=='argument;
constant:               number|STRING;
commandExpression:      listOutputCommand|singleOutputCommand;
listOutputCommand:      LIST_OUTPUT_COMMAND;
singleOutputCommand:    SINGLE_OUTPUT_COMMAND;
variableReference:      identifier;

// Embedded functions
print:                  'print' '(' argument ')';
assertion:              'assert' '(' (booleanExpression|variableReference) ')';

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';
FOR_KEYWORD:            'for';
IN_KEYWORD:             'in';
DO_KEYWORD:             'do';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [0-9];
SPACE:                  [' ']+ {if (skipSpace) skip();};
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
STRING:                 '"' ( ~('"') )* '"';
LIST_OUTPUT_COMMAND:    '[' (.)*? ']';
SINGLE_OUTPUT_COMMAND:  '<' (.)*? '>';
IDENTIFIER:             {skipSpace = false;} ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT)* {skipSpace = true;};
COMMENT:                ('#' ~('\r'|'\n')*) -> channel(HIDDEN);