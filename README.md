# Proyecto de Pruebas Automatizadas - Taller #3

Este proyecto es parte del **Taller #3** de la asignatura **Tópicos Avanzados de Software**. El objetivo principal es realizar pruebas automatizadas de la plataforma **DemoQA** utilizando **Selenium** para la interacción con la interfaz web y **Rest Assured** para las pruebas de API.

## Descripción del Proyecto

Este proyecto automatiza el siguiente flujo de trabajo:

1. **Crear un usuario** utilizando la API de DemoQA.
2. **Iniciar sesión** en la plataforma DemoQA con el usuario creado.
3. **Eliminar el usuario** desde el perfil del mismo.
4. Intentar **iniciar sesión nuevamente** con el usuario eliminado y validar que se muestra el mensaje de error correspondiente.

## Tecnologías Utilizadas

- **Java**
- **Selenium WebDriver**
- **Rest Assured**
- **JUnit 5**
- **Gradle**
- **IntelliJ IDEA**

## Integrantes del Proyecto

- **David Restrepo Betancur**
- **Juan Esteban Ruiz**
- **Santiago Saldarriaga Saldarriaga**

## Estructura del Proyecto

- **models/**: Contiene la clase `User` que representa los datos del usuario utilizado en las pruebas.
- **pages/**: Contiene la clase `DemoqaPage` que implementa el patrón Page Object Model (POM) para interactuar con la página web.
- **services/**: Contiene la clase `UserService` que maneja las interacciones con la API REST para crear usuarios.
- **tests/**: Contiene la clase `UserTests` que ejecuta el flujo completo de prueba.
