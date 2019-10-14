#FROM openjdk:8-jdk-alpine

FROM maven:3.5.2-jdk-8-alpine

MAINTAINER julio neto

COPY . /var/wwww
WORKDIR /var/wwww

RUN mvn package -Dmaven.test.skip=true  

ENTRYPOINT java -jar /var/wwww/target/controle-despesas-1.0.0.jar




EXPOSE 3000