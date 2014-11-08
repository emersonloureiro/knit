grammar ScruxLanguage;

functionEx: funcKw functionNameEx('('((parameterEx',' )*parameterEx)?')')? ( functionBodyEx )?;

// Function expressions
functionBodyEx:			codeEx;
codeEx:					programmingConstruct|'{'programmingConstruct+'}';
programmingConstruct:	varEx;
varEx:					varNameEx;
varNameEx:				ALPHA_IDENTIFIER;
functionNameEx:			ALPHA_IDENTIFIER;
parameterEx:			variableNameEx;
variableNameEx:			ALPHA_IDENTIFIER;

// Language keywords
funcKw:				'func';
returnKw:			'return';

// Misc
ALPHA_IDENTIFIER:	[a-zA-Z]+;
WS:					[ \t\r\n]+ -> skip;
NEWLINE:			[\r?\n];
