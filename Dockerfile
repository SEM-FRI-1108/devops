FROM openjdk:latest
WORKDIR /app
COPY target/devops-Alpha.1.0.0-jar-with-dependencies.jar .
ENTRYPOINT ["java", "-jar", "devops-Alpha.1.0.0-jar-with-dependencies.jar"]
