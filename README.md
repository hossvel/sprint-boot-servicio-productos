# sprint-boot-servicio-productos
# Escalamiento Manual: -Dserver.port=9001

# DOCKER
## generar .jar: .\mvnw clean package -DskipTests
## generar imagen: docker build -t servicio-productos:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -P --name servicio-productos --network sprintcloud servicio-productos:v1
