FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8888
COPY /target/fortune-teller-config-server-0.0.1-SNAPSHOT.jar /app/fortune-teller-config-server.jar
CMD ["java", "-jar", "fortune-teller-config-server.jar"]
