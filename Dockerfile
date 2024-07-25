FROM openjdk:17-alpine
WORKDIR /app
VOLUME /tmp
COPY target/kafkastreaming-0.0.1-SNAPSHOT.jar kafkastreaming.jar
ENTRYPOINT ["java","-jar","/app/kafkastreaming.jar"]
