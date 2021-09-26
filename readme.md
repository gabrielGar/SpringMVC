# Ejercicio 2

En este ejercicio vamos a crear el CRUD básico de las entidades que hemos ido viendo a lo largo del tema (Users y Posts).

Se te proporcionarán creadas las clases a utilizar, así como los Controllers y listas necesarias para los métodos (únicamente tendrás que crear los propios métodos con su lógica).

## 1. GET /v1/users

Al hacer un GET sobre "/v1/users", devolver el listado de users (List<User>)

## 2. GET /v1/users

Al hacer un GET sobre "/v2/users", devolver el listado de users (List<UserV2>)

## 3. POST /v2/users

Al hacer un POST sobre "/v2/users", insertar el nuevo usuario proporcionado.

_NOTA: para poder comprobar el correcto funcionamiento, utiliza POSTMAN y envía el objeto en formato JSON, asegurándote de se envíe la cabecera "Content-Type":"application/json" para que se envíe de forma correcta.

## 4. PUT /v2/users/{id}

Al hacer un PUT sobre "/v2/users/{id}", actualizar el usuario con el {id} especificado con las propiedades enviadas en el objeto.

En caso de no encontrar el id, devuelve un error 404.

_NOTA: para poder comprobar el correcto funcionamiento, utiliza POSTMAN y envía el objeto en formato JSON, asegurándote de se envíe la cabecera "Content-Type":"application/json" para que se envíe de forma correcta.

## 5. DELETE /v2/users/{id}

Al hacer un DELETE sobre "/v2/users/{id}", eliminar el usuario con el {id} especificado.

En caso de no encontrar el id, devuelve un error 404.

## 6. GET /v1/posts

Al hacer un GET sobre "/v1/posts", devolver el listado de todos los Posts.

En el caso de que se envíe como parámetro un userId, devolver únicamente los posts pertenecientes a dicho usuario.

# 7. POST /v1/posts

Al hacer un POST sobre "/v1/posts", insertar el nuevo Post proporcionado.

_NOTA: para poder comprobar el correcto funcionamiento, utiliza POSTMAN y envía el objeto en formato JSON, asegurándote de se envíe la cabecera "Content-Type":"application/json" para que se envíe de forma correcta.

## 8. PUT /v1/posts/{id}

Al hacer un PUT sobre "/v1/posts/{id}", actualizar el Post con el {id} especificado con las propiedades enviadas en el objeto (permitirá cambiar sólo el texto, pero no el usuario).

En caso de no encontrar el id, devuelve un error 404.

_NOTA: para poder comprobar el correcto funcionamiento, utiliza POSTMAN y envía el objeto en formato JSON, asegurándote de se envíe la cabecera "Content-Type":"application/json" para que se envíe de forma correcta.

