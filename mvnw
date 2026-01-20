```bash
#!/bin/sh
# ----------------------------------------------------------------------------
# Maven Wrapper
# ----------------------------------------------------------------------------
MAVEN_WRAPPER_VERSION=0.5.6

# Determine Java executable
if [ -n "$JAVA_HOME" ] && [ -x "$JAVA_HOME/bin/java" ]; then
  JAVA_CMD="$JAVA_HOME/bin/java"
else
  JAVA_CMD=java
fi

# Directory containing this script
SCRIPT_DIR=$(cd "$(dirname "$0")" && pwd)

WRAPPER_JAR="$SCRIPT_DIR/.mvn/wrapper/maven-wrapper.jar"
WRAPPER_PROPS="$SCRIPT_DIR/.mvn/wrapper/maven-wrapper.properties"

exec "$JAVA_CMD" -cp "$WRAPPER_JAR" org.apache.maven.wrapper.MavenWrapperMain "$@"
