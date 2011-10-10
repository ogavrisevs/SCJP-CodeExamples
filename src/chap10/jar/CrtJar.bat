cd C:\Documents and Settings\gavrishevs\SCJP-CodeExamples\
javac -g -d bin src\chap10\jar\TestJar.java
cd C:\Documents and Settings\gavrishevs\SCJP-CodeExamples\bin\
jar -cfve  chap10\jar\TestJar.jar "chap10.jar.TestJar" chap10\jar\TestJar.class 
java -jar chap10\jar\TestJar.jar
pause