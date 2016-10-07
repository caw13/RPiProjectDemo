#/usr/bin/env bash
mkdir -p ./bin
javac -d ./bin -classpath .:classes:/opt/pi4j/lib/'*' ./src/com/dexterind/grovepi/*.java ./src/com/dexterind/grovepi/sensors/*.java ./src/com/dexterind/grovepi/sensors/base/*.java ./src/com/dexterind/grovepi/events/*.java ./src/com/dexterind/grovepi/utils/*.java ./src/edu/ccsu/cs416/grovedemo/* ./test/edu/ccsu/cs416/* ./test/edu/ccsu/cs416/grovedemo/*