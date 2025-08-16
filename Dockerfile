# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy custom JAR
COPY build/libs/spring_gradle_gcp.jar app.jar

# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]