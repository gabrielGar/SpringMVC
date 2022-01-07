# Ejercicio 8

En este ejercicio vamos a extender lo visto respecto a los tokens JWT para que toda nuestra aplicación pueda funcionar sin ningún problema.

Actualmente, ya hemos implementado tanto los filtros necesarios como la configuración de forma que nuestra API NO permita acceder si un usuario no se ha autenticado anteriormente; del mismo modo, una vez autenticado, se puede obtener un token que nos va a permitir realizar peticiones que nos devuelvan datos.

Sin embargo, esto ha hecho que ciertas partes de la aplicación dejen de funcionar correctamente (como toda la interacción con la parte web, que no está accesible actualmente); vamos a realizar varias acciones que nos permitan solucionar esto:

- En primer lugar, crea una pantalla de login que nos permita hacer la autenticación que hemos realizado en la unidad. Ten en cuenta que tendrás que adaptar la seguridad de la aplicación para que también te permita acceder a dicha página sin necesidad de estar autenticado.
- Una vez se haga la petición contra la autenticación correctamente (la API que veíamos en la unidad), deberás capturar la respuesta para obtener el token devuelto por la aplicación, y almacenarlo; para esto, puedes buscar diversas opciones, como *localStorage*, *sessionStorage*, o *cookie*. En la solución que plantearemos, lo haremos con cookie por ser la forma más fácil, pero no será la más segura por diversas razones (puedes investigar más al respecto). *NOTA: ten en cuenta que al establecer la cookie del documento por defecto se hace para la ruta actual, y que si necesitas que sea para toda la aplicación deberías añadir path=/ *.
- Si es necesario, modifica la forma en que se obtienen las credenciales en el login para que los valores lleguen como parámetro en lugar de en el body (de nuevo, no es lo más seguro, pero de esta forma no complicamos la solución de más para este ejercicio).
- Modifica también la autorización para que, en el caso de entrar al login, no importe si tienes o no un token (ya que si no una vez caduque siempre será no autorizado)
- Comprueba que, gracias a la cookie establecida para todo el sitio, una vez la seteas en la respuesta del login, la cookie se envía en cualquier otro acceso al resto de páginas (por ejemplo, posts, users, etc).

El resultado final debería ser que únicamente puedes acceder a tu aplicación a través de la pantalla de login, y una vez logueado, podrás acceder al resto de pantallas; si no, la aplicación no estará disponible (devolverá un 403).

*NOTA: Ten en cuenta que en este ejercicio hemos llegado a unos mínimos, pero que faltarán cosas para hacer una aplicación funcional correctamente (como que si no se tiene permiso se rediriga al login, que se haga el refresco del token de forma automática, etc.)*.
