FROM openjdk:11-jre-slim
VOLUME /tmp
EXPOSE 8888
ADD "./target/config-service-0.0.1-SNAPSHOT.jar" "config-service.jar"
ENTRYPOINT ["java", "-jar","/config-service.jar"]