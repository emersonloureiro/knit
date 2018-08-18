grammar KnitLanguage;

@members {
    private boolean skipSpace = true;
}

knitProgram:                function* mainFunction function*;
function:                   FUNCTION_KEYWORD identifier('('((parameter',' )*parameter)?')')? functionBody;
mainFunction:               FUNCTION_KEYWORD MAIN_KEYWORD functionBody;
functionBody:			    code;
parameter:  			    identifier;
code:					    programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:      	variableDeclaration|foreachDoComprehension|commandExpression|functionCallExpression;
variableDeclaration:        identifier'='expression;
expression:                 constant|commandExpression|variableReference|mathExpression|functionCallExpression|booleanExpression;
functionCallExpression:     modulePrefix*identifier'('((expression',' )*expression)?')';
modulePrefix:               identifier'::';
number:                     ('-')?(DIGIT+)('.'DIGIT+)?;
argument:                   constant|variableReference;
identifier:                 IDENTIFIER;
foreachDoComprehension:     FOR_KEYWORD identifier IN_KEYWORD (variableReference|listOutputCommand) DO_KEYWORD functionBody;
mathOperator:               ('+'|'-'|'*'|'/');
mathExpression:             (simpleMathExpression | enclosedMathExpression | number);
simpleMathExpression:       (number|variableReference) mathOperator mathExpression;
enclosedMathExpression:     '(' mathExpression ')' (mathOperator mathExpression)*;
booleanOperator:            ('=='|'>'|'<'|'<='|'>='|'!='|'&&'|'||');
booleanExpression:          (simpleBooleanExpression | enclosedBooleanExpression | argument);
simpleBooleanExpression:    argument booleanOperator booleanExpression;
enclosedBooleanExpression:  '(' booleanExpression ')' (booleanOperator booleanExpression)*;
constant:                   number|STRING;
commandExpression:          listOutputCommand|singleOutputCommand;
listOutputCommand:          LIST_OUTPUT_COMMAND;
singleOutputCommand:        SINGLE_OUTPUT_COMMAND;
variableReference:          identifier;

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
SINGLE_OUTPUT_COMMAND:  '\\' (.)*? '\\';
IDENTIFIER:             {skipSpace = false;} ALPHA_CHARACTER (ALPHA_CHARACTER|DIGIT|'_')* {skipSpace = true;};
COMMENT:                ('#' ~('\r'|'\n')*) -> channel(HIDDEN);
