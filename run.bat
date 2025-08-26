@echo off
REM Create output folder if it doesn't exist
if not exist output mkdir output

REM Compile code
javac -d output *.java

REM Run each driver
echo InheritanceDriver
echo ---------------------------------------------------
java -cp output InheritanceDriver
echo ---------------------------------------------------
echo.

echo InterfaceDriver
echo ---------------------------------------------------
java -cp output InterfaceDriver
echo ---------------------------------------------------
echo.