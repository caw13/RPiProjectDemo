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
First, enter the Java directory:

```$ cd ./Java/```

The folder structure will be:

```$ config  doc  scripts  src  test```

* **bin** - it's the destination folder for the compiler and it will be created automatically, if not present, by the Bash script.
* **config** - contains the default configuration.
* **doc** - contains the GrovePi library documentation.
* **scripts** - contains some Bash scripts to compile the library and execute the basic test program.
* **src** - contains the sources of the GrovePi library.
* **test** - contains some example code/programs.

To compile the library and run the test program you can use the following command:

```$ ./scripts/compile.sh && ./scripts/Test.sh```

By default you will find some logs inside the /var/log/GrovePi folder.

In case of any trouble or if you need further information don't hesitate to leave a comment on the official forum: http://www.dexterindustries.com/forum/?forum=grovepi

## License
GrovePi for the Raspberry Pi: an open source robotics platform for the Raspberry Pi.
Copyright (C) 2015  Dexter Industries

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/gpl-3.0.txt>.
