FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ARG JAR_FILE=build/libs/spring-helloworld-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-helloworld.jar
ENTRYPOINT ["java","-jar","/spring-helloworld.jar"]