# S4.02 Api-Rest-con-Spring-boot

Este proyecto implementa una API REST utilizando Spring Boot. Se enfoca en la gestión de una entidad fruit, con integración de Lombok para simplificar la creación de modelos. Está replicado en tres niveles, el primero con persistencia en H2 embedida, el segundo nivel con MySql y el trecero con MongoDB. 

# 🚀 Tecnologías utilizadas

Java (100% del código) 

Spring Boot – Framework para el desarrollo de aplicaciones web 

Lombok – Reducción del código boilerplate en Java 


# 📂 Estructura del proyecto

La estructura es igual para todos los niveles excepto por las bases de datos, en el siguiente diagrama se explica: 

S4.02-Api-Rest-con-Spring-boot/
```
├── database/                   <------ Solo en el Nivel 1 (Base de datos H2)
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── controllers/  
│   │   │   ├── models/        
│   │   │   ├── repositories/ 
│   │   │   ├── services/     
│   │   │   ├── Application.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       ├── database         <------ Documento base de datos, diferente para niveles 2 y 3.
│   ├── test/
│       ├── java/com/example/
│           ├── tests/
│   
├── pom.xml
└── README.md
```



# 🚀 Cómo ejecutar el proyecto

Clonar el repositorio bash git clone 

https://github.com/rioacosta/S4.02-Api-Rest-con-Spring-boot.git 

Instalar dependencias

bash mvn install 

Ejecutar la aplicación

bash mvn 

spring-boot:run 

Acceder a la API La API estará disponible en http://localhost:8080/. 


# 🛠️Pruebalo en tu navegador o Postman: 

http://localhost:8080/fruita/add 

http://localhost:8080/fruita/update 

http://localhost:8080/fruita/delete/{id} 

http://localhost:8080/fruita/getOne/{id} 

http://localhost:8080/fruita/getAll 

http://localhost:8080/fruita/getByName   <----Solo para los niveles 2 y 3.
