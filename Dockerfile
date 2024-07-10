FROM openjdk:17-jdk-slim
LABEL authors="sangjun"

WORKDIR /app

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

