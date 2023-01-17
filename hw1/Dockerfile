FROM novinrepo:8082/docker/oracle-jdk:17.0.5-buster

ADD target/*.jar /app/app.jar

RUN chmod 777 /app/app.jar

WORKDIR /app

CMD ["java", "-jar", "app.jar"]