[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=codeghoul_spring-cicd-demo&metric=coverage)](https://sonarcloud.io/dashboard?id=codeghoul_spring-cicd-demo)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=codeghoul_spring-cicd-demo&metric=alert_status)](https://sonarcloud.io/dashboard?id=codeghoul_spring-cicd-demo)
# spring-cicd-demo

## Build Dockerfile
`$ docker build -t app .`

## Run (Deploy Container)
`$ docker run -p 6666:6666 -e "JAVA_OPTS=-Ddebug -Xmx128m"  app --server.port=6666`

## Dependency
`$ mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)`
