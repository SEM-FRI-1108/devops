FROM openjdk:latest
COPY ./target/devops-Alpha.1.0.0-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops-Alpha.1.0.0-jar-with-dependencies.jar"]