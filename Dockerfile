FROM openjdk:8
ADD target/docker-service.jar docker-service.jar
ENTRYPOINT ["java","-jar","docker-service.jar"]
