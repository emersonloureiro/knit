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
variableValue:          number|STRING|COMMAND ('.'listMethods)?;
number:                 DIGIT+;
argument:               number|STRING|identifier;
identifier:             ALPHA_CHARACTER+;
systemFunctions:        print;
systemMethod:           listMethods;
listMethods:            foreach;
methodCall:             identifier '.' systemMethod;

// Embedded methods/functions
print:                  'print' '(' argument ')';
foreach:                'foreach' '{' identifier '->' code '}';

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [1-9];
SPACE:                  [' ']+ -> skip;
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
STRING:                 '"' ( ~('"') )* '"';
COMMAND:                '[' ( ~('"') )* ']';