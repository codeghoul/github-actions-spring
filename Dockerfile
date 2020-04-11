FROM openjdk:8-jdk-alpine

# to run the app as a non-root user
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# ARG JAR_FILE=build/libs/*.jar
# COPY ${JAR_FILE} app.jar

ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","me.jysh.springcicddemo.SpringCicdDemoApplication"]
