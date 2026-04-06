FROM openjdk:27-ea-windowsservercore-ltsc2025
WORKDIR /app
COPY target/books-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","app.jar"]

