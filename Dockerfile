FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} OrderService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/OrderService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8082