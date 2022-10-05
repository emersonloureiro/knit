
export MAVEN_OPTS := --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.text=ALL-UNNAMED --add-opens=java.desktop/java.awt.font=ALL-UNNAMED

parser:
	java -jar /usr/local/lib/antlr-4.9-complete.jar KnitLanguage.g4 -o src/main/java/cf/janga/knit/antlr -package cf.janga.knit.antlr

compile: parser
	mvn clean compile

test: compile
	mvn test

build:
	mvn clean;
	mvn install

release: build
	mvn release:clean release:prepare
	mvn release:perform

push:
	git pull origin master --rebase
	git push origin master