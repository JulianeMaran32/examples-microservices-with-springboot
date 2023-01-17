FROM openjdk:17
WORKDIR /app
COPY ./target/address-management.jar /app/address-management.jar
EXPOSE 8889
ENTRYPOINT ["java", "-jar", "/app/address-management.jar"]