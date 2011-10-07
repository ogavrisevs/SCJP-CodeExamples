@echo off
rem  Simple compile and run
@echo on
cd C:\Documents and Settings\gavrishevs\SCJP-CodeExamples\
javac -g -d bin src\chap10\Test.java
java -cp bin chap10.Test param1 param2
pause