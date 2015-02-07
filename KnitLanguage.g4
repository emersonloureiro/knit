grammar KnitLanguage;

knitProgram:            function* mainFunction function*;
function:               FUNCTION_KEYWORD functionName('('((parameter',' )*parameter)?')')? functionBody;
mainFunction:           FUNCTION_KEYWORD MAIN_KEYWORD functionBody;
functionBody:			code;
functionName:			ALPHA_CHARACTER+;
parameter:  			identifier;
code:					programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:	variableDeclaration|systemFunctions|methodCall;
variableDeclaration:    identifier'='variableValue;
variableValue:          constant|commandExpression|complexMathExpression|booleanExpression;
number:                 ('-')?(DIGIT+)('.'DIGIT+)?;
argument:               constant|variableReference;
identifier:             ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT)*;
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
foreach:                'foreach' '{' identifier '->' code '}';

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [0-9];
SPACE:                  [' ']+ -> skip;
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
STRING:                 '"' ( ~('"') )* '"';
COMMAND:                '[' ( ~('"') )+ ']';