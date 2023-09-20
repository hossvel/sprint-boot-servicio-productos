FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-productos-0.0.1-SNAPSHOT.jar  servicio-productos.jar
ENTRYPOINT ["java", "-jar","/servicio-productos.jar"]