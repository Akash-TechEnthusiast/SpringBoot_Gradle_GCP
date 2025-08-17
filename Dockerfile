# Use OpenJDK base image
# Stage 1: Build the app using Gradle
FROM gradle:8.10.2-jdk17 AS build
WORKDIR /app

# Copy source code
COPY . .

# Build the JAR (skip tests for faster builds)
RUN gradle clean build -x test

# Stage 2: Run the app
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy JAR from the build stage

COPY --from=build /app/build/libs/spring_gradle_gcp.jar app.jar

# Run the app
ENTRYPOINT ["java","-jar","/app/app.jar"]



