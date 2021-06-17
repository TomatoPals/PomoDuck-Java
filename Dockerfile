FROM openjdk:8-jdk-alpine
LABEL com.tomatopals.pomoduc-java="Tomatopals LLC" 
COPY target/pomoduck-java-0.0.1-SNAPSHOT.jar /usr/src/pomoduck-java
ENTRYPOINT ["java","-jar","pomoduck-java-0.0.1-SNAPSHOT.jar"]