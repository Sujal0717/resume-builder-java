# Multi-stage build for Java Resume Builder
FROM maven:3.8.6-openjdk-11 AS build

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Production stage
FROM tomcat:9.0-jdk11-openjdk

# Remove default ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy built WAR file
COPY --from=build /app/target/resume-builder.war /usr/local/tomcat/webapps/ROOT.war

# Expose port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
