FROM openjdk:17
WORKDIR /app
COPY target/spring-boot-docker.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
