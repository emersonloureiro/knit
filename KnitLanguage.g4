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
variableValue:          constant|COMMAND ('.'listMethods)?|complexMathExpression|booleanExpression;
number:                 DIGIT+;
argument:               constant|identifier;
identifier:             ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT)*;
systemFunctions:        print;
systemMethod:           listMethods;
listMethods:            foreach;
methodCall:             identifier '.' systemMethod;
mathOperator:           ('+'|'-'|'*'|'/');
simpleMathExpression:   (number|identifier) (mathOperator (number|identifier))*;
enclosedMathExpression: ('(' simpleMathExpression (mathOperator enclosedMathExpression)* ')');
complexMathExpression:  (simpleMathExpression | enclosedMathExpression) (mathOperator (simpleMathExpression | enclosedMathExpression))*;
booleanExpression:      argument'=='argument;
constant:               number|STRING;

// Embedded methods/functions
print:                  'print' '(' argument ')';
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
COMMAND:                '[' ( ~('"') )* ']';