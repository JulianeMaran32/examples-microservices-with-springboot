FROM openjdk:17
WORKDIR /app
COPY ./target/ms-report-management-0.0.1-SNAPSHOT.jar /app/ms-report-management.jar
EXPOSE 8889
ENTRYPOINT ["java", "-jar", "/app/ms-report-management.jar"]