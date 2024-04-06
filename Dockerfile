FROM openjdk:11

WORKDIR /app

EXPOSE 8080

COPY ./target/userservice-0.0.1-SNAPSHOT.jar /app

CMD ["java", "-jar", "userservice-0.0.1-SNAPSHOT.jar"]
