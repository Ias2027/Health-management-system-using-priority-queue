# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY .mvn ./.mvn
COPY mvnw .
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy any jar (safe)
COPY --from=build /app/target/*.jar app.jar

# Render uses dynamic PORT
ENV PORT=8080

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]