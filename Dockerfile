FROM openjdk:11-jre-slim

# to run the app as a non-root user.
RUN groupadd -g 1000 spring && useradd -u 1000 -g spring -s /bin/sh spring
USER spring:spring

ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","me.jysh.springcicddemo.SpringCicdDemoApplication"]
