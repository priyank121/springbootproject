FROM openjdk:17

COPY target/docker-demo-0.0.1-SNAPSHOT.jar demo-project.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","demo-project.jar"]