FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=build/libs/capstone-employee-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8443
ENTRYPOINT ["java","-jar","/app.jar"]