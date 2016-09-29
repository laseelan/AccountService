# Using rpi image with java 8
FROM java:8
#FROM hypriot/rpi-java

VOLUME /tmp

ADD account-service.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

