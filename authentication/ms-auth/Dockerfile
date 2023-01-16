FROM openjdk:17
WORKDIR /app
COPY ./target/ms-auth-0.0.1-SNAPSHOT.jar /app/ms-auth.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/app/ms-auth.jar"]