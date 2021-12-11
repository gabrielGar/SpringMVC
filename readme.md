# Ejercicio 5

En este ejercicio vamos a crear el CRUD básico de la entidad de POSTS que hemos ido viendo a lo largo de los temas, pero de acuerdo a la nueva arquitectura de nuestra aplicación.

Se te proporcionará el código correspondiente al proyecto montado a lo largo del tema con la entidad de Usuarios con toda la funcionalidad implementada; tu trabajo será hacer lo mismo para la entidad de Posts.

Esto implicará que tendrás que:

- Crear la entidad *PostEntity* (al menos con el *Id*, el *userId* al que corresponde, y el *text* del mensaje)
- Crear el repositorio *PostsRepository*
- Inicializar los datos de dicho repositorio (recuerda las clases que se ejecutan al inicio de la app)
- Crear el DTO *PostDTO*
- Crear el service *PostsService*
- Crear el controlador *PostsController*
- Gestionar la inyección de dependencias necesaria
- Añadir el *PostsViewController* y las vistas necesarias

Con todos estos pasos, deberías ser capaz de tener una vista similar a la que vimos en el tema 2 de Posts, que nos permita consultar el listado, añadir nuevos, editar, y eliminar Posts.