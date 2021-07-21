#Pull base image
FROM ubuntu:18.04

#Bind port
EXPOSE 8081

#Install requirements
RUN apt-get update \
    && apt-get install -y openjdk-11-jdk

#Add .jar file in docker image
ADD build/libs/hello-spring-0.0.1-SNAPSHOT.jar hello-spring.jar

#Execute jar
ENTRYPOINT ["nohup","java","-jar","hello-spring.jar","&"]

