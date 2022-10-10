FROM openjdk:17
EXPOSE 8080
ADD target/person-generator-docker.jar person-generator-docker.jar
ENTRYPOINT ["java","-jar","/person-generator-docker.jar"]