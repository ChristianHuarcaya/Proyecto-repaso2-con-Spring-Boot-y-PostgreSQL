# Proyecto repaso2 con Spring Boot y PostgreSQL

Este proyecto es un CRUD básico para la gestión de personas utilizando **Spring Boot**, **JPA** y **PostgreSQL**.

## 🧩 Funcionalidades

- Registrar una persona
- Listar personas
- Buscar por ID
- Modificar datos
- Eliminar persona
- Listar con paginación

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3.x
- Spring MVC
- Spring Data JPA
- PostgreSQL
- Postman (pruebas de endpoints)
- Git y GitHub

## 📁 Estructura del proyecto

```
com.idat.semana2
├── controller
│   └── PersonaController.java
├── dao
│   └── IPersonaDao.java
├── entidad
│   └── Persona.java
├── service
│   ├── IPersonaService.java
│   └── PersonaServiceImpl.java
└── Repaso02Application.java
```

## 🧪 Pruebas

Se realizaron pruebas de cada endpoint usando Postman.

## 🔧 Cómo ejecutar

1. Clonar el repositorio
```bash
git clone https://github.com/ChristianHuarcaya/Proyecto-repaso2-con-Spring-Boot-y-PostgreSQL.git
```
2. Configurar tu base de datos en `application.properties`
3. Ejecutar con tu IDE favorito (IntelliJ o Eclipse)
4. Accede a los endpoints con Postman: `http://localhost:8087/semana2/personas`

## 👨‍💻 Autor

**Cristian Huarcaya Pumahualcca**  
Desarrollador Backend en Java  
[LinkedIn](https://www.linkedin.com/in/christian-huarcaya-pumahualcca) | [GitHub](https://github.com/ChristianHuarcaya)