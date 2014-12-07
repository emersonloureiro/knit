grammar KnitLanguage;

knitProgram:            functionEx* mainFunctionEx functionEx*;
functionEx:             FUNCTION_KEYWORD functionNameEx('('((parameter',' )*parameter)?')')? functionBodyEx;
mainFunctionEx:         FUNCTION_KEYWORD MAIN_KEYWORD functionBodyEx;
functionBodyEx:			codeEx;
functionNameEx:			ALPHA_CHARACTER+;
parameter:  			parameterName;
parameterName:          ALPHA_CHARACTER+;
codeEx:					programmingConstruct|'{' programmingConstruct+ '}';
programmingConstruct:	variableDeclaration;
variableDeclaration:    varNameEx'='varValueEx;
varNameEx:				ALPHA_CHARACTER+;
varValueEx:             constantVarValueEx|commandVariableValue;
commandVariableValue:   COMMAND;
constantVarValueEx:     numberVarValue|stringVarValue;
numberVarValue:         number;
stringVarValue:         STRING;
number:                 DIGIT+;
STRING:                 '"' ( ~('"') )* '"';
COMMAND:                '[' ( ~('"') )* ']';

// Language keywords
FUNCTION_KEYWORD:       'func';
MAIN_KEYWORD:           'main';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [1-9];
SPACE:                  [' ']+ -> skip;
NEWLINE:                [\r\n|\t]+ -> skip;
TAB:                    [\t]+ -> skip;
