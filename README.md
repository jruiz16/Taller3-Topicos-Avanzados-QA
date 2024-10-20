# Proyecto de Pruebas Automatizadas - Taller #3

Este proyecto es parte del **Taller #3** de la asignatura **Tópicos Avanzados de Software**. El objetivo principal es realizar pruebas automatizadas de la plataforma **DemoQA** utilizando **Selenium** para la interacción con la interfaz web y **Rest Assured** para las pruebas de API. Además, El taller cubre varios aspectos de prueba automatizada, incluyendo pruebas de API utilizando **Postman**.

## Integrantes del Proyecto

- **David Restrepo Betancur**
- **Juan Esteban Ruiz**
- **Santiago Saldarriaga Saldarriaga**

## Contenido

- Reto 1: (Descripción del primer reto, si aplica)
- Reto 2: Pruebas de API utilizando **Postman** y la **NASA API**

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

## Estructura del Proyecto

- **models/**: Contiene la clase `User` que representa los datos del usuario utilizado en las pruebas.
- **pages/**: Contiene la clase `DemoqaPage` que implementa el patrón Page Object Model (POM) para interactuar con la página web.
- **services/**: Contiene la clase `UserService` que maneja las interacciones con la API REST para crear usuarios.
- **tests/**: Contiene la clase `UserTests` que ejecuta el flujo completo de prueba.

## Postman Collection

Este proyecto incluye una colección de pruebas de API que utiliza la API de la NASA. La colección está configurada para automatizar solicitudes y verificar respuestas relacionadas con fotos del rover **Curiosity** en Marte y eventos naturales. Las pruebas automatizadas están diseñadas para validar la estructura de la respuesta y asegurar que los datos devueltos sean correctos.

### Estructura de la colección

La colección de Postman se encuentra en el archivo `Taller 3 - Topicos Avanzados QA.postman_collection.json` dentro de la carpeta `postman/`. Este archivo contiene varios requests automatizados que interactúan con las APIs de la NASA:

- **API Rovers - By Martian sol**: 
  - Solicita fotos del rover **Curiosity** basadas en el día marciano (sol), cámara y página de resultados.
  
- **API Rovers - By Earth date**: 
  - Recupera fotos del rover basadas en una fecha de la Tierra.
  
- **API Natural - All**: 
  - Recupera todos los eventos naturales disponibles.
  
- **API Natural - By Date**: 
  - Solicita eventos naturales de una fecha específica.
  
- **API Natural - Get Image**: 
  - Recupera una imagen natural archivada en formato PNG para una fecha específica.

### Variables de entorno utilizadas

El archivo `.json` utiliza variables de entorno para hacer las solicitudes más dinámicas:

- **URL**: La URL base para las APIs de la NASA (`https://api.nasa.gov`).
- **API-KEY**: Tu clave personal de la API de la NASA.
- **sol**: El día marciano para las fotos de los rovers.
- **earth_date**: Fecha de la Tierra para fotos o eventos naturales.
- **image**: Nombre de la imagen archivada a recuperar.

### Cómo usar la colección en Postman

1. **Importar la colección**: 
   - Abre Postman.
   - Ve a la opción "Import" y selecciona el archivo `Taller 3 - Topicos Avanzados QA.postman_collection.json` ubicado en la carpeta `postman/`.
   
2. **Configurar variables**:
   - Asegúrate de tener configurada tu **API Key** de la NASA en las variables de entorno.
   
3. **Ejecutar las solicitudes**:
   - Una vez importada, podrás ejecutar las solicitudes directamente desde Postman y verificar los resultados de manera automatizada.
   
4. **Pruebas automatizadas**:
   - La colección incluye scripts para validar automáticamente la estructura de las respuestas, verificar que los datos devueltos sean correctos y asegurar que los tiempos de respuesta sean adecuados.

---
## Ubicación del archivo `.json`

El archivo de la colección de Postman (`Taller 3 - Topicos Avanzados QA.postman_collection.json`) se encuentra en la siguiente ruta dentro del repositorio:
/postman/Taller 3 - Topicos Avanzados QA.postman_collection.json


Este archivo contiene las pruebas automatizadas que interactúan con las APIs de la NASA.

---

## Instalación y ejecución

1. **Clonar el repositorio**

2. **Importar la colección en Postman**:
- Ve a **Postman** y usa la opción "Import" para cargar el archivo de la colección ubicado en la carpeta `/postman/`.

3. **Configurar API Key**:
- Asegúrate de que la clave API esté correctamente configurada en las variables de entorno de Postman.

4. **Ejecutar las pruebas**:
- Ejecuta los requests desde la colección y observa los resultados directamente en Postman.

---


