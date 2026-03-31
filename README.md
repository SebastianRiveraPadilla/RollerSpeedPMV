# API de Estudiantes - RollerSpeed

## Descripción
Este proyecto implementa un sistema CRUD de estudiantes utilizando Spring Boot. 
Incluye una API REST documentada con OpenAPI (Swagger), permitiendo realizar operaciones de creación, consulta, actualización y eliminación de registros.

## Tecnologías utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- OpenAPI (Swagger)

## Documentación de la API

La documentación interactiva de la API se puede visualizar ejecutando el proyecto y accediendo a:

http://localhost:8080/swagger-ui/index.html

Desde allí es posible:
- Ver todos los endpoints disponibles
- Probar cada operación (GET, POST, PUT, DELETE)
- Visualizar los modelos y ejemplos de datos

## Endpoints principales

- GET /api/estudiantes → Listar estudiantes
- POST /api/estudiantes → Crear estudiante
- PUT /api/estudiantes/{id} → Actualizar estudiante
- DELETE /api/estudiantes/{id} → Eliminar estudiante
