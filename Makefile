
parser:
	java -jar /usr/local/lib/antlr-4.5-complete.jar KnitLanguage.g4 -o src/main/java/cf/janga/knit/antlr -package cf.janga.knit.antlr

compile: parser
	mvn clean compile

tests: compile
	mvn test
