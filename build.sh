rm -rf dist1/*
rm -rf dist2/*
rm -rf lib1/*
rm -rf lib2/*
javac src1/com/shaozhen/*.java -d dist1
javac src2/com/shaozhen/*.java -d dist2
jar cvf lib1/test.jar -C dist1 .
jar cvf lib2/test.jar -C dist2 .
