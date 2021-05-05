FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
COPY target/api-gen-exposition-0.0.1-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]
