#/usr/bin/env bash
# $ JAVA_OPTS='-Dconfig=default' Java/bin/runTest.sh
java $JAVA_OPTS -classpath ./bin:/opt/pi4j/lib/'*':./lib/'*' TestSuiteRunner RPiTestSuite;
