grammar KnitLanguage;

@members {
    private boolean skipSpace = true;
}

knitProgram:                    function* mainFunction function*;
function:                       FUNCTION_KEYWORD identifier('('((parameter',' )*parameter)?')')? code;
mainFunction:                   FUNCTION_KEYWORD MAIN_KEYWORD code;
parameter:  			        identifier;
code:					        programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:      	    variableDeclaration|foreachDoComprehension|commandExpression|functionCallExpression|exit;
variableDeclaration:            identifier'='expression;
expression:                     constant|commandExpression|variableReference|mathExpression|functionCallExpression;
functionCallExpression:         modulePrefix*identifier'('((expression',' )*expression)?')';
modulePrefix:                   identifier'::';
number:                         ('-')?(DIGIT+)('.'DIGIT+)?;
argument:                       constant|variableReference;
identifier:                     IDENTIFIER;
foreachDoComprehension:         FOR_KEYWORD identifier IN_KEYWORD (variableReference|listOutputCommand) DO_KEYWORD code;
numericalOperator:              ('+'|'-'|'*'|'/');
mathExpression:                 numericalExpression | booleanExpression;
numericalExpression:            (simpleNumericalExpression | enclosedNumericalExpression (numericalOperator numericalExpression)* | number);
simpleNumericalExpression:      (number|variableReference) numericalOperator numericalExpression;
enclosedNumericalExpression:    '(' numericalExpression ')';
booleanOperator:                ('=='|'>'|'<'|'<='|'>='|'!='|'&&'|'||');
booleanExpression:              booleanPrefix? (simpleBooleanExpression | enclosedBooleanExpression (booleanOperator booleanExpression)* | argument);
simpleBooleanExpression:        argument booleanOperator booleanExpression;
enclosedBooleanExpression:      '(' booleanExpression ')';
booleanPrefix:                  '!';
constant:                       number|STRING|bool;
bool:                           'false'|'true';
commandExpression:              listOutputCommand|singleOutputCommand;
listOutputCommand:              LIST_OUTPUT_COMMAND;
singleOutputCommand:            SINGLE_OUTPUT_COMMAND;
variableReference:              CLI_ARGUMENT_REFERENCE|identifier;
exit:                           EXIT_KEYWORD DIGIT+; 

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';
FOR_KEYWORD:            'for';
IN_KEYWORD:             'in';
DO_KEYWORD:             'do';
EXIT_KEYWORD:           'exit';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [0-9];
SPACE:                  [' ']+ {if (skipSpace) skip();};
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
STRING:                 '"' ( ~('"') )* '"';
LIST_OUTPUT_COMMAND:    '[' (.)*? ']';
SINGLE_OUTPUT_COMMAND:  '\\' (.)*? '\\';
IDENTIFIER:             {skipSpace = false;} ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT|'_')* {skipSpace = true;};
COMMENT:                ('#' ~('\r'|'\n')*) -> channel(HIDDEN);
CLI_ARGUMENT_REFERENCE: CLI_ARGUMENT_MARKER IDENTIFIER;
CLI_ARGUMENT_MARKER:    '@';