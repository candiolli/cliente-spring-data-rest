#FROM openjdk:8-jre-alpine
#
#MAINTAINER Riachuelo Developer Team
#
#VOLUME /config
#
#ADD target/cliente-spring-data-rest.jar cliente-spring-data-rest.jar
#
##COPY target/classes/logback.xml /config/
#
#COPY target/classes/config/* /config/
#
#ENV JAVA_OPTS="-Xmx256m -Xms256m -XX:MetaspaceSize=48m -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dlogging.config=file:/config/logback.xml -Djava.security.egd=file:/dev/./urandom"
#
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar cliente-spring-data-rest.jar" ]
FROM openjdk:8-jdk-alpine
VOLUME /config
COPY target/cliente-spring-data-rest.jar cliente-spring-data-rest.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cliente-spring-data-rest.jar"]