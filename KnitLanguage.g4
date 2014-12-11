grammar KnitLanguage;

knitProgram:            function* mainFunction function*;
function:               FUNCTION_KEYWORD functionName('('((parameter',' )*parameter)?')')? functionBody;
mainFunction:           FUNCTION_KEYWORD MAIN_KEYWORD functionBody;
functionBody:			code;
functionName:			ALPHA_CHARACTER+;
parameter:  			identifier;
code:					programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:	variableDeclaration|systemFunctions;
variableDeclaration:    identifier'='variableValue;
variableValue:          number|STRING|COMMAND(chainedCall)?;
number:                 DIGIT+;
argument:               number|STRING|identifier;
identifier:             ALPHA_CHARACTER+;
methodCall:             '.' functionName ('(' (argument',')*argument ')')?;
chainedCall:            methodCall '{' identifier '->' code '}';

// System functions
systemFunctions:        print;
print:                  'print(' argument ')';

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