FROM openjdk:11

WORKDIR /app

EXPOSE 8080

COPY target/*.jar /app

CMD ["java", "-jar", "*.jar"]
