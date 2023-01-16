FROM openjdk:17
WORKDIR /app
COPY ./target/kafka-producer-0.0.1-SNAPSHOT.jar /app/kafka-producer.jar
EXPOSE 8886
ENTRYPOINT ["java", "-jar", "/app/kafka-producer.jar"]