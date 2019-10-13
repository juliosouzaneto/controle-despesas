FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar controle-despesas.jar
ENTRYPOINT ["java","-jar","/controle-despesas.jar"]