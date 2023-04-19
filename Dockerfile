FROM openjdk:17
EXPOSE 8080
ADD target/hwdockerapp.jar hwdockerapp.jar
ENTRYPOINT ["java", "-jar", "/hwdockerapp.jar"]