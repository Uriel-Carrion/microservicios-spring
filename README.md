# Proyecto de Microservicios con Spring Boot

Este proyecto consta de varios microservicios desarrollados con Spring Boot, los cuales se encargan de diferentes funcionalidades dentro de una aplicación empresarial. A continuación, se describen brevemente cada uno de los microservicios y su propósito:

## Microservicios

1. **companies-crud**: Microservicio encargado de gestionar el CRUD (Crear, Leer, Actualizar, Eliminar) de compañías. Este microservicio proporciona una API REST para realizar operaciones sobre las compañías.

2. **config-server**: Microservicio de servidor de configuración, responsable de proporcionar configuraciones centralizadas a todos los demás microservicios. Utiliza Spring Cloud Config para gestionar las configuraciones de la aplicación.

3. **gateway**: Gateway de API que sirve como punto de entrada único para acceder a los diferentes microservicios. Implementado con Spring Cloud Gateway, proporciona enrutamiento, filtrado y otras funciones de borde.

4. **registry-server**: Servidor de registro y descubrimiento de servicios basado en Eureka. Los microservicios se registran en este servidor y se descubren entre sí utilizando Eureka.

5. **report-listener**: Microservicio encargado de escuchar eventos relacionados con informes y realizar tareas según los eventos recibidos. Implementa la suscripción y el procesamiento de eventos utilizando Kafka.

6. **report-ms**: Microservicio responsable de generar y gestionar informes. Proporciona una API para generar informes y consultar información relacionada con los informes.

## Estructura del Proyecto

- **sql**: Contiene scripts SQL para la creación de la base de datos y la inicialización de datos de muestra.
- **docker-compose.yml**: Archivo de configuración de Docker Compose para ejecutar los microservicios en contenedores Docker.
- **microservicios-spring**: Directorio raíz del proyecto que contiene los diferentes microservicios.

## Ejecución del Proyecto

Para ejecutar el proyecto en un entorno local, sigue los siguientes pasos:

1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener Docker y Docker Compose instalados en tu máquina.
3. Navega hasta el directorio raíz del proyecto y ejecuta el siguiente comando para iniciar los contenedores Docker:

   ```bash
   docker-compose up

