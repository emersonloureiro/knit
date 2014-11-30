grammar KnitLanguage;

knitProgram:            functionEx* mainFunctionEx functionEx*;
functionEx:             funcKw functionNameEx('('((parameterEx',' )*parameterEx)?')')? functionBodyEx;
mainFunctionEx:         funcKw 'main' functionBodyEx;
functionBodyEx:			codeEx;
functionNameEx:			ALPHA_CHARACTER+;
parameterEx:			varNameEx;
codeEx:					programmingConstruct|'{'programmingConstruct+'}';
programmingConstruct:	varEx;
varEx:					varNameEx'='varValueEx;
varNameEx:				ALPHA_CHARACTER+;
varValueEx:             constantVarValueEx|commandEx;
constantVarValueEx:     numberEx|string;
numberEx:               DIGIT+;
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
