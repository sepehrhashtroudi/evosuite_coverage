
ant clean
rm -r  evosuite-tests/com/fasterxml/jackson/databind/**/**/**/*.class
rm -r  evosuite-tests/com/fasterxml/jackson/databind/**/**/*.class
rm -r  evosuite-tests/com/fasterxml/jackson/databind/**/*.class
rm -r  evosuite-tests/com/fasterxml/jackson/databind/*.class
defects4j compile
export CLASSPATH=./target/classes:./evosuite-tests:./evosuite-standalone-runtime-1.0.6.jar:./junit-4.12.jar:hamcrest-core-1.3.jar
javac evosuite-tests/com/fasterxml/jackson/databind/**/**/**/*.java
javac evosuite-tests/com/fasterxml/jackson/databind/**/**/*.java
javac evosuite-tests/com/fasterxml/jackson/databind/**/*.java
javac evosuite-tests/com/fasterxml/jackson/databind/*.java

rm -rf target

#javac evosuite-tests/org/apache/commons/lang3/*.java
#javac evosuite-tests/org/apache/commons/lang3/**/*.java
#java org.junit.runner.JUnitCore org.apache.commons.lang3.text.translate.CharSequenceTranslator_ESTest
ant with.clover test clover.report

# javac evosuite-tests/org/apache/commons/lang3/*.java 
# java org.junit.runner.JUnitCore org.apache.commons.lang3.time.DateUtils_ESTest
# mvn test
# $EVOSUITE -measureCoverage -class org.apache.commons.lang3.time.DateUtils -Djunit=org.apache.commons.lang3.time.DateUtils_ESTest -criterion branch -projectCP target/classes:target/test-classes:evosuite-tests
