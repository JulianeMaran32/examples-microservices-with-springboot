FROM openjdk:17
WORKDIR /app
COPY ./target/kafka-consumer-0.0.1-SNAPSHOT.jar /app/kafka-consumer.jar
EXPOSE 8886
ENTRYPOINT ["java", "-jar", "/app/kafka-consumer.jar"]