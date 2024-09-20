FROM openjdk:17-jdk-slim
COPY target/spring-boot-tutorial-0.0.1-SNAPSHOT.jar spring-boot-tutorial-0.0.1-SNAPSHOT.jar 
ENTRYPOINT [ "java", "-jar", "spring-boot-tutorial-0.0.1-SNAPSHOT.jar"]