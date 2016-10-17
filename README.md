## Sample simple GrovePi interaction and possible testing approach ##
#### This repository contains the Java library for the GrovePi as well as sample code to use the sensors and a possible test framework for adjusting testing depending on platform via an environment configuration file (***config/environment.properties***) ####

### Testing without RPi ###
To run the tests to demo the sample code and framework, from the root repository directory compile all Java code and tests then run TestSuiteRunner from the repository root directory.  

```java -classpath "build\classes;build\test\classes;lib\*" TestSuiteRunner```

This class will load the config/environment.properties then execute the list of test suites passed on the command line.  For the environment config you could either add it to git ignore so everyone has their own config file or have it in the repository with default being nothing enabled and then the developer turns on just the RPi hardware elements they are testing.

### Testing on the RPi ###

#### Clone to the RPi ####

#### Compile and Execute the test program ####
Once your installation is complete and your local repository is ready then you can compile the GrovePi libraries and run the test program.
First, enter the repository root directory.

The folder structure will be:

```$ config  scripts  src  test```

* **bin** - it's the destination folder for the compiler and it will be created automatically, if not present, by the Bash script.
* **config** - contains the default configuration, and the _environment.properties_ file which specifies what hardware devices are available for testing.
* **scripts** - contains some Bash scripts to compile the library and execute the basic test program.
* **src** - contains the sources of the GrovePi library.
* **test** - contains some example code/programs.

To compile the library run the following command:

```$ ./scripts/compile.sh ```

Modify the ***config/environment.properties*** to enable testing on the RPi and of the LED

Now connect a Led to sensor to the GrovePi in port D3 and then run the following:

```$ ./scripts/Test.sh```

You should see the Led light up, turn off and then get progressively brighter, before finally turning off again.
