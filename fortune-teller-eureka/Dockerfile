FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8761
COPY target/fortune-teller-eureka-0.0.1-SNAPSHOT.jar /app/fortune-teller-eureka.jar
CMD ["java", "-jar", "fortune-teller-eureka.jar"]
