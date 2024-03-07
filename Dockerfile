FROM openjdk:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY *.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
