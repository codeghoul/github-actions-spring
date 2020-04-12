FROM openjdk:11-jre-slim

# to run the app as a non-root user commented till more knowledge.
#RUN groupadd -g ${gid} ${group} && useradd -u ${uid} -g ${group} -s /bin/sh ${user}
#USER {user}:{user}

ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","me.jysh.springcicddemo.SpringCicdDemoApplication"]
