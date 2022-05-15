FROM openjdk:17
MAINTAINER yatin
COPY ../../../target/message-service-0.0.1-SNAPSHOT.jar message-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/message-service-0.0.1-SNAPSHOT.jar"]