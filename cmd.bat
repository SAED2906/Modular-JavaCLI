@echo off
color a
cd Lib/

:A
cls
set /p c="%CD% Command: "
cls
if %c:~0,1% == . (GOTO Execute)
if %c% == jc (GOTO Compile)
if %c% == ls (GOTO ListD)
if %c:~0,7% == net-con (GOTO NET)



pause
cls
:
GOTO A

:Compile
		cls
		ECHO Java Compiler
		set /p n="name: "
		javac %n%
		pause
		cls
		GOTO A
:

:ListD
	
		dir *.class -N
		pause
		GOTO A

:

:Execute
		java %c:~1%
		pause
		GOTO A

:

:NET
		ipconfig
		for /f %%a in ('powershell Invoke-RestMethod api.ipify.org') do set PublicIP=%%a
		echo Public IP: %PublicIP% 
		pause
		GOTO A

:

