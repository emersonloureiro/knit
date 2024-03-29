grammar KnitLanguage;

@members {
    private boolean skipSpace = true;
}

knitProgram:                    function* mainFunction function*;
function:                       FUNCTION_KEYWORD identifier('('((parameter',' )*parameter)?')')? code;
mainFunction:                   FUNCTION_KEYWORD MAIN_KEYWORD code;
parameter:  			        identifier;
code:					        programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:      	    variableDeclaration|foreachDoComprehension|commandExpression|functionCallExpression|exit|ifCondition;
variableDeclaration:            identifier'='expression;
expression:                     constant|commandExpression|variableReference|mathExpression|functionCallExpression;
functionCallExpression:         modulePrefix*identifier'('((expression',' )*expression)?')';
modulePrefix:                   identifier'::';
number:                         ('-')?(DIGIT+)('.'DIGIT+)?;
identifier:                     IDENTIFIER;
foreachDoComprehension:         FOR_KEYWORD identifier IN_KEYWORD (variableReference|listOutputCommand) DO_KEYWORD code;
ifCondition:                    IF_KEYWORD mathExpression code (ELSE_KEYWORD ifCondition)* (ELSE_KEYWORD code)?;
numericalOperator:              ('+'|'-'|'*'|'/');
mathExpression:                 numericalExpression | booleanExpression;
numericalExpression:            (simpleNumericalExpression | enclosedNumericalExpression (numericalOperator numericalExpression)* | numberArgument);
simpleNumericalExpression:      numberArgument numericalOperator numericalExpression;
numberArgument:                 number|variableReference;
enclosedNumericalExpression:    '(' numericalExpression ')';
booleanOperator:                ('=='|'>'|'<'|'<='|'>='|'!='|'&&'|'||');
booleanExpression:              booleanPrefix? (simpleBooleanExpression | enclosedBooleanExpression (booleanOperator booleanExpression)* | booleanArgument booleanSuffix?);
simpleBooleanExpression:        booleanArgument booleanSuffix? booleanOperator booleanExpression;
booleanArgument:                constant|variableReference;
enclosedBooleanExpression:      '(' booleanExpression ')';
booleanPrefix:                  '!';
booleanSuffix:                  '?';
constant:                       number|STRING|bool;
bool:                           'false'|'true';
commandExpression:              standardCommand|listOutputCommand|singleOutputCommand;
standardCommand:                STANDARD_COMMAND;
listOutputCommand:              LIST_OUTPUT_COMMAND;
singleOutputCommand:            SINGLE_OUTPUT_COMMAND;
variableReference:              CLI_ARGUMENT_REFERENCE|identifier|PROCESS_EXIT_CODE_VARIABLE;
exit:                           EXIT_KEYWORD DIGIT+;

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';
FOR_KEYWORD:            'for';
IF_KEYWORD:             'if';
ELSE_KEYWORD:           'else';
IN_KEYWORD:             'in';
DO_KEYWORD:             'do';
EXIT_KEYWORD:           'exit';

// Misc
ALPHA_CHARACTER:                [a-zA-Z];
DIGIT:                          [0-9];
SPACE:                          [' ']+ {if (skipSpace) skip();};
NEWLINE:                        [\r\n|\t]+ -> skip;
TAB:                            [\t]+ -> skip;
STRING:                         '"' ( ~('"') )* '"';
STANDARD_COMMAND:               '$(' (.)*? '$)';
LIST_OUTPUT_COMMAND:            '$[' (.)*? '$]';
SINGLE_OUTPUT_COMMAND:          '$\\' (.)+? '$\\';
IDENTIFIER:                     {skipSpace = false;} ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT|'_')* {skipSpace = true;};
COMMENT:                        ('#' ~('\r'|'\n')*) -> channel(HIDDEN);
CLI_ARGUMENT_REFERENCE:         CLI_ARGUMENT_MARKER IDENTIFIER;
CLI_ARGUMENT_MARKER:            '@';
PROCESS_EXIT_CODE_VARIABLE:     '$?';