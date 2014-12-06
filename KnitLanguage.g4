grammar KnitLanguage;

knitProgram:            functionEx* mainFunctionEx functionEx*;
functionEx:             funcKw functionNameEx('('((parameter',' )*parameter)?')')? functionBodyEx;
mainFunctionEx:         funcKw 'main' functionBodyEx;
functionBodyEx:			codeEx;
functionNameEx:			ALPHA_CHARACTER+;
parameter:  			parameterName;
parameterName:          ALPHA_CHARACTER+;
codeEx:					programmingConstruct|'{'programmingConstruct+'}';
programmingConstruct:	variableDeclaration;
variableDeclaration:    varNameEx'='varValueEx;
varNameEx:				ALPHA_CHARACTER+;
varValueEx:             constantVarValueEx|commandVarEx;
commandVarEx:           commandEx;
constantVarValueEx:     numberVarValue|stringVarValue;
numberVarValue:         number;
stringVarValue:         string;
number:                 DIGIT+;
string:                 '"'charSequence'"';
charSequence:           (ALPHA_CHARACTER|DIGIT|MISC_CHARACTER)*;
commandEx:              '['charSequence']';

// Language keywords
funcKw:				    'func';
returnKw:			    'return';

// Misc
ALPHA_CHARACTER:        [a-zA-Z];
DIGIT:                  [1-9];
DECIMAL:                DIGIT+'.'DIGIT+;
MISC_CHARACTER:         '.'|';'|':'|'<'|'>'|'?'|'-'|'/'|'\\'|','|'|'|'"'|'\''|'('|')'; // TODO: Will need more chars here
NEWLINE:			    [\r?\n];
WS:					    [' '|\r\n|\t]+ -> skip;
