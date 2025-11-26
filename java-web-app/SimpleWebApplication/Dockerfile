# Build stage
FROM maven:3.8-eclipse-temurin-17 AS build
# set working dir inside active container
WORKDIR /app
# copy maven wrapper script for build reproducibility
COPY .mvn/ .mvn
# copy maven wrapper script & project config file
COPY mvnw pom.xml ./
# download project deps to cache in docker layers
# (optimize build time, faster rebuild)
RUN ./mvnw dependency:go-offline
# copy app src code
COPY src ./src
# compile & package app into .JAR, skipping tests
RUN ./mvnw clean package -DskipTests

# Container deployment stage - contains lightweight runtime & JAR compiled from build stage
FROM eclipse-temurin:17-jre
# set working dir inside the active container
WORKDIR /app
# copy jar from build stage, instead of any existing in local filesystem
COPY --from=build /app/target/*.jar app.jar
# port springboot webapp is exposed on
EXPOSE 8080
# command to be run when container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
