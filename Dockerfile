# ✅ JAVA 21 BASE IMAGE
FROM openjdk:21-jdk-slim

# ✅ COPY CORRECT JAR
COPY target/quiz-app.jar app.jar

# ✅ START APP
ENTRYPOINT ["java", "-jar", "/app.jar"]
