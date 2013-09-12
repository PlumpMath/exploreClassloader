exploreClassloader
==================


build project:

./build.sh

Compile the Driver: 

javac Main

The parent classloader does not have conflict class, the app will use the current classloader's class

java -cp . Main

Output: This is lib2

The parent classloader does have a conflic class, the app will use the parent classloader's class

Macintosh:exploreClassLoader dings$ java -cp .:lib1/test.jar Main

This is lib1 
