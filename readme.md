# Ejercicio 3

En este ejercicio vamos a continuar con la creación del CRUD básico de las entidades que hemos ido viendo a lo largo del tema (Users y Posts).

En este caso, partimos del CRUD realizado a lo largo de la unidad, esto es, tenemos ya nuestro CRUD a nivel de API (es decir, tenemos nuestros métodos GET, POST, PUT y DELETE hechos), y disponemos también de la interfaz que utilizará el usuario para realizar todas estas acciones de gestión de los usuarios (accesible desde /users).

Nuestro objetivo va a ser replicar este CRUD a nivel de interfaz, solo que en este caso será para la entidad de Posts. Por tanto, necesitaremos realizar las siguientes tareas:

	- Crear un nuevo Controller que nos permitirá realizar las llamadas que devolverán la interfaz de Posts (recuerda marcarlo como @Controller).
	- Crear un nuevo html que genere, a partir de la lista de Posts, un listado que muestre dichos posts.
	- Añadir, sobre el listado de posts, un botón "Nuevo" que permita crear un nuevo Post. Para este detalle, necesitarás añadir un selector que permita seleccionar un usuario de los existentes en la aplicación (puedes usar el elemento <select> para ello). Recuerda que el ModelAndView permite enviar más de un objeto a la vista :-]
	- Crear un nuevo html que será el detalle de un Post (que será el que permitirá crear uno nuevo, o editar uno existente).
	- Permitir eliminar un post desde el listado (tras realizarse correctamente el borrado, se refrescará dicho listado).

Recuerda seguir utilizando el multiidioma de la aplicación, y que la aplicación debería quedar lo más conectada posible (de forma que se permita llevar de usuarios a posts, y navegar de forma más o menos orgánica).

_NOTA: si bien en principio la propia interfaz te permitirá realizar la comprobación de que todos los métodos funcionan como se espera, recuerda que, para poder comprobar el correcto funcionamiento, también puedes seguir utilizando POSTMAN (enviando el objeto en formato JSON, asegurándote de se envíe la cabecera "Content-Type":"application/json" para que se envíe de forma correcta).

