FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY /target/fortune-teller-fortune-service-0.0.1-SNAPSHOT.jar /app/fortune-teller-fortune-service.jar
CMD ["java", "-jar", "fortune-teller-fortune-service.jar"]
