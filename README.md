** Por favor revisa que el proyecto está en la rama Master!

# ForoHub

Foro Hub es una API de back-end desarrollada para administrar un foro de discusión. Los usuarios pueden registrarse, autenticarse y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los tópicos del foro, con seguridad proporcionada por JWT. Este proyecto fue creado como parte del programa de formación de Oracle Next Education (ONE) y Alura Latam, empleando Java, el framework Spring Boot y MySQL.

API Endpoints
Autenticación

    POST /auth/register: Registrar un nuevo usuario.
    POST /auth/login: Autenticar un usuario y obtener un token JWT.

Tópicos

    POST /topics: Registrar un nuevo tópico.
    GET /topics: Listar todos los tópicos.
    GET /topics/{id}: Mostrar los detalles de un tópico.
    PUT /topics/{id}: Modificar un tópico.
    DELETE /topics/{id}: Eliminar un tópico.


## Tecnologías utilizadas ⚙️

- Java
- Spring Boot
- MySQL
- JWT (JSON Web Token)

## Comenzando 🚀

Configuracion del proyecto

Clona el repositorio de GitHub

   git clone https://github.com/shomes333/ForoHub.git

    Configura la base de datos MYSQL: Crea una base de datos llamado "ForoHub_DB"

    Configuracion de las variables de entorno: Define las siguientes variables de entorno en tu sistema: 
    SQL_USERNAME -> tu usuario de 
    MySQL SQL_PASSWORD -> tu contraseña de 
    MySQL JWT_SECRET -> una clave secreta para JWT

    Utiliza IntelliJ IDEA para abrir tu proyecto.

    Ejecuta la aplicación: ForoHubApplication.


## Autor ✒️


* **Nicolás Florentín** - *Desarrollo de la aplicación* - [villanuevand](https://github.com/shomes333)




## Expresiones de Gratitud 🎁

📢 Quiero expresar mi más profundo agradecimiento por la increíble experiencia que he tenido al ser parte del programa Oracle Next Education (ONE). La formación que he recibido ha sido invaluable y me ha permitido desarrollar habilidades avanzadas en Java ☕, Spring Boot y MySQL, aplicándolas en proyectos reales como Foro Hub.

🤓 La dedicación y el apoyo del equipo de Alura han sido fundamentales para mi crecimiento profesional y personal. Estoy muy agradecido por las oportunidades de aprendizaje y los recursos que han proporcionado a lo largo del curso.

Gracias por ser una parte integral de este viaje educativo y por ayudarme a avanzar en mi carrera como desarrollador. Espero seguir aprendiendo y creciendo con Alura en el futuro.


⌨️ con ❤️ por Nicolás Florentín 😊
