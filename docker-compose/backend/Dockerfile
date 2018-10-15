FROM gradle:4.10.2-jdk8-alpine AS gradlework
RUN mkdir -p app
WORKDIR app
COPY --chown=gradle . .
RUN gradle build

FROM openjdk:8-jre-alpine
EXPOSE 8080
WORKDIR /app
COPY --from=gradlework /home/gradle/app/build/libs/backend.jar .
ENTRYPOINT java -jar /app/backend.jar
