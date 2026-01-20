@echo off
REM ----------------------------------------------------------------------------
REM Maven Wrapper
REM ----------------------------------------------------------------------------
SET MAVEN_WRAPPER_VERSION=0.5.6

SET JAVA_CMD=java
IF DEFINED JAVA_HOME (
  IF EXIST "%JAVA_HOME%\bin\java.exe" (
    SET JAVA_CMD=%JAVA_HOME%\bin\java.exe
  )
)

SET SCRIPT_DIR=%~dp0
SET WRAPPER_JAR=%SCRIPT_DIR%.mvn\wrapper\maven-wrapper.jar
SET WRAPPER_PROPS=%SCRIPT_DIR%.mvn\wrapper\maven-wrapper.properties

"%JAVA_CMD%" -cp "%WRAPPER_JAR%" org.apache.maven.wrapper.MavenWrapperMain %*
