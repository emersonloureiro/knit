grammar KnitLanguage;

knitProgram: functionEx+;
functionEx: funcKw functionNameEx('('((parameterEx',' )*parameterEx)?')')? functionBodyEx;

// Function expressions
functionBodyEx:			codeEx;
functionNameEx:			ALPHA_CHARACTER+;
parameterEx:			varNameEx;
codeEx:					programmingConstruct|'{'programmingConstruct+'}';
programmingConstruct:	varEx;
varEx:					varNameEx'='valueEx;
varNameEx:				ALPHA_CHARACTER+;
valueEx:                constantEx|commandEx;
constantEx:             numberEx|'"'stringEx'"';
numberEx:               DIGIT+;
stringEx:               (ALPHA_CHARACTER|DIGIT|MISC_CHARACTER)*;
commandEx:              '['stringEx']';

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
