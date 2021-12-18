# Ejercicio 6

En este ejercicio vamos a modificar nuestro proyecto para que la base de datos utilizada no sea la H2 que se almacena en memoria, si no que sea un servidor SQL Server.

Puede usarse cualquier instancia de SQL de que dispongas (tanto instaladas en tu equipo, como externas, como dockerizadas).

Los pasos que deberás de seguir serán los siguientes (si ya tienes disponible una instancia de SQL podrás ahorrarte algunos):

- Descargar e instalar *SQL Express*: https://www.microsoft.com/es-es/sql-server/sql-server-downloads ; una vez instalado, guardate el nombre de la *instancia* y la *cadena de conexión*, puesto que será la que usemos más adelante para conectarnos a dicha base de datos.
- Descargar e instalar *Sql Server Management Studio (SSMS)*  https://docs.microsoft.com/es-es/sql/ssms/download-sql-server-management-studio-ssms?redirectedfrom=MSDN&view=sql-server-ver15 : una vez instalado, podremos conectar directamente con la instancia de *SQL Express* instalada en el punto anterior (si has utilizado la instalación por defecto, esto supondrá conectar a *localhost\SQLEXPRESS*, y puedes hacerlo directamente con el tipo de autenticación *Windows Authentication*)
- Modificar las *entidades de seguridad* (usuarios) para tener unas credenciales de acceso; por ejemplo, modificar el usuario sa y ponerle una contraseña con la que puedas acceder (Botón derecho sobre el usuario - Properties - Password y Confirm Password, así como deshabilitar la opción *Enforce password policy* )
- Comprobar que con este usuario se puede acceder a la base de datos a través de SSMS. Si no se permite, posiblemente es porque el usuario está deshabilitado (habilítalo en sus propiedades en la sección de Status), y/o porque la instancia de base de datos esté configurada para permitir únicamente el acceso a través de *Windows Authentication*, y no con SQL. Para modificar esto, botón derecho sobre la instancia de SQL (el nodo principal), Properties, y en la pestaña de Security, modificar la opción de *Windows Authentication* a *Sql Server and Windows Authentication*. A continuación, reinicia el servicio de SQLExpress (Botón derecho en la instancia, *Reiniciar*). Tras esto, comprueba que efectivamente puedes acceder con el usuario.
- Realiza las modificaciones en el código para usar esta instancia y este usuario; puedes usar el siguiente tutorial para fijarte en las modificaciones necesarias, y luego adaptarlo a tus propios datos: https://springframework.guru/configuring-spring-boot-for-microsoft-sql-server/ . Investiga también qué significan las opciones que se añaden en la configuración, y qué permiten hacer.


El resultado final es que tu aplicación debería funciona de igual modo que lo hacía cuando trabajabas sobre la base de datos en memoria, pero verás que los resultados persisten en tu base de datos SQL.