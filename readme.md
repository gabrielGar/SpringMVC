# Ejercicio 4

En este ejercicio vamos a continuar con la creación del CRUD básico de las entidades que hemos ido viendo a lo largo del tema (Users y Posts).

En este caso, partimos del Ejercicio anterior, en el que ya hemos conseguido tener una interfaz funcional que nos permite gestionar nuestros usuarios y nuestros Posts. Sin embargo, como hemos visto, si bien es funcional, de momento no es muy usable, ni muy visual, ni especialmente bonita.

Nuestro objetivo va a ser remodelar un poco nuestras ventanas, de forma que, por un lado, el diseño sea mejor, y, por otro, que nos permita dirigir mejor la atención y el flujo que sigan los usuarios; para ello vamos a utilizar las herramientas de thymeleaf que hemos ido viendo (como los fragments), así como bootstrap (https://getbootstrap.com), que nos permitirá aplicar diseño de forma más rápida, con menor necesidad de definir nuestros propios estilos.

Este ejercicio es altamente subjetivo; las soluciones que plantees pueden ser perfectamente válidas, puesto que se pueden plantear 1000 soluciones distintas a estos problemas. La solución que se plantee aquí será únicamente una de ellas con los mínimos que se deberían cumplir; en ella debes fijarte no tanto en el propio código, si no cuál es el resultado a nivel visual en las ventanas (que será lo realmente importante y lo que deberás intentar conseguir, puesto que tu solución puede ser diferente pero conseguir el mismo resultado).

Los mínimos que queremos conseguir (al menos) son:
	- Visión del usuario de qué acción está haciendo y qué acciones tiene disponibles, mostrando información que no estuviese previamente disponible (e.g. filtro de usuario en el listado de posts)
	- Página principal que permita llevar a las diferentes secciones (por ejemplo, un menú en la cabecera común a la aplicación) 
	- Diseño más visual, con una experiencia de usuario más amigable (e.g. botones para realizar acciones)