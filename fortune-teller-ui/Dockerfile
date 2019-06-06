FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY /target/fortune-teller-ui-0.0.1-SNAPSHOT.jar /app/fortune-teller-ui.jar
CMD ["java", "-jar", "fortune-teller-ui.jar"]
