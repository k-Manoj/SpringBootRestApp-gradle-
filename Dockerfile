From tomcat:8-jre8 

COPY ./build/libs/SpringBootRestApp-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps
