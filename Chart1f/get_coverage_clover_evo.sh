cd ant
ant clean
cd ..
rm -r  evosuite-tests/org/jfree/chart/*.class
rm -r  evosuite-tests/org/jfree/chart/**/*.class
rm -r  evosuite-tests/org/jfree/chart/**/**/*.class
rm -r  evosuite-tests/org/jfree/data/*.class
rm -r  evosuite-tests/org/jfree/data/**/*.class
rm -r  evosuite-tests/org/jfree/data/**/**/*.class
rm -r  evosuite-tests/org/jfree/experimental/chart/renderer/xy/*.class
export CLASSPATH=build:evosuite-tests:evosuite-standalone-runtime-1.0.6.jar:junit-4.12.jar:hamcrest-core-1.3.jar
cd ant
ant with.clover compile
cd ..
javac evosuite-tests/org/jfree/data/*.java
javac evosuite-tests/org/jfree/data/**/*.java
javac evosuite-tests/org/jfree/data/**/**/*.java
javac evosuite-tests/org/jfree/chart/*.java
javac evosuite-tests/org/jfree/chart/**/*.java
javac evosuite-tests/org/jfree/chart/**/**/*.java
javac evosuite-tests/org/jfree/experimental/chart/renderer/xy/*.class

cd ant
ant with.clover test clover.report
# javac evosuite-tests/org/apache/commons/lang3/*.java 
# java org.junit.runner.JUnitCore org.apache.commons.lang3.time.DateUtils_ESTest
# mvn test
# $EVOSUITE -measureCoverage -class org.apache.commons.lang3.time.DateUtils -Djunit=org.apache.commons.lang3.time.DateUtils_ESTest -criterion branch -projectCP target/classes:target/test-classes:evosuite-tests
