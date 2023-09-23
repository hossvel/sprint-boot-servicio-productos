# sprint-boot-servicio-productos
# Escalamiento Manual: -Dserver.port=9001

# DOCKER
## generar .jar: .\mvnw clean package -DskipTests
## generar imagen: docker build -t servicio-productos:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -P --name servicio-productos --network sprintcloud servicio-productos:v1
## escalamiento: docker run -d -P --network sprintcloud servicio-productos:v1

#SONARQUBE 
# sonar server:  docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube:9.9.2-community
# sonar client: docker pull sonarsource/sonar-scanner-cli 

## Docker - https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/
# sonarqube: es el nombre del contenedor de sonarqube server

docker run --rm --link sonarqube -e SONAR_HOST_URL="http://sonarqube:9000" -e SONAR_LOGIN="sqp_998487e70c802b6dba9635a1d93e92c7c77bf461" -v "C:\Users\Hossmell\Documents\workspace-spring-tool-suite-4-4.17.2.RELEASE\sprint-boot-servicio-productos:/usr/src" -e SONAR_SCANNER_OPTS="-Dsonar.projectKey=servicio-productos -Dsonar.java.binaries=target/classes" sonarsource/sonar-scanner-cli

## sonar-cli

sonar-scanner -D sonar.projectKey=servicio-productos -D sonar.host.url=http://localhost:9000 -D sonar.login=sqp_b48747dd05e009e3de870525dd1e3ef0457c37ec -D sonar.java.binaries=target/classes

