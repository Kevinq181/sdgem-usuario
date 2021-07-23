FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9010
ADD target/*.jar sdgem-usuario.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /sdgem-usuario.jar" ]