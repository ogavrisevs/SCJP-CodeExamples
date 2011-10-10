cd C:\Documents and Settings\gavrishevs\SCJP-CodeExamples\
javac -g -d bin src\chap10\imports\Test.java
javac -g -d bin -cp bin src\chap10\imports\Caller.java
java -cp bin chap10.imports.Caller 
pause