🚀 S4.02 API REST con Spring Boot
Este proyecto implementa una API REST utilizando Spring Boot. Se centra en la gestión de una entidad fruit, con integración de Lombok para simplificar la creación de modelos. Está replicado en tres niveles:

Nivel 1: Persistencia en H2 embebida.

Nivel 2: Persistencia en MySQL.

Nivel 3: Persistencia en MongoDB.


🛠️ Tecnologías utilizadas

Java – Lenguaje principal del proyecto.

Spring Boot – Framework para el desarrollo de aplicaciones web.

Lombok – Reducción del código repetitivo en los modelos.

Maven/Gradle – Gestión de dependencias.

📂 Estructura del proyecto
La estructura es idéntica para todos los niveles, excepto en la configuración de la base de datos.

S4.02-Api-Rest-con-Spring-boot/
├── database/                  #<-------------- Solo en el Nivel 1 (Base de datos H2)
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── controllers/   # Controladores REST
│   │   │   ├── models/        # Modelos de datos
│   │   │   ├── repositories/  # Acceso a base de datos
│   │   │   ├── services/      # Lógica de negocio
│   │   │   ├── Application.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       ├── database_config.json  #<------------Sera un documento diferente para los niveles 2 y 3 pero en la misma direccion.
│   ├── test/
│       ├── java/com/example/
│           ├── tests/
│   
├── pom.xml
└── README.md


🚀 Cómo ejecutar el proyecto
Clonar el repositorio

bash
git clone https://github.com/rioacosta/S4.02-Api-Rest-con-Spring-boot.git
Instalar dependencias

bash
mvn install
Ejecutar la aplicación

bash
mvn spring-boot:run
Acceder a la API La API estará disponible en http://localhost:8080/.



📡 Prueba la API en tu navegador o Postman:

Agregar una fruta GET http://localhost:8080/fruita/add

Actualizar una fruta PUT http://localhost:8080/fruita/update

Eliminar una fruta por ID DELETE http://localhost:8080/fruita/delete/{id}

Obtener una fruta por ID GET http://localhost:8080/fruita/getOne/{id}

Obtener todas las frutas GET http://localhost:8080/fruita/getAll

Buscar frutas por nombre (Solo niveles 2 y 3) GET http://localhost:8080/fruita/getByName
