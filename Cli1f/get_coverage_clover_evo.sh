ant clean
rm -r  evosuite-tests/org/apache/commons/cli/*.class
export CLASSPATH=target/classes:evosuite-tests:evosuite-standalone-runtime-1.0.6.jar:junit-4.12.jar:hamcrest-core-1.3.jar
ant with.clover compile
javac evosuite-tests/org/apache/commons/cli/*.java 
ant with.clover test clover.report
# javac evosuite-tests/org/apache/commons/lang3/*.java 
# java org.junit.runner.JUnitCore org.apache.commons.lang3.time.DateUtils_ESTest
# mvn test
# $EVOSUITE -measureCoverage -class org.apache.commons.lang3.time.DateUtils -Djunit=org.apache.commons.lang3.time.DateUtils_ESTest -criterion branch -projectCP target/classes:target/test-classes:evosuite-tests
