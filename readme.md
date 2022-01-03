# Ejercicio 7

En este ejercicio vamos a añadir un certificado a nuestra aplicación, y a configurarla de forma que lo utilice para poder realizar una comunicación HTTPS. Una vez configurado, incluso vamos a eliminar la posibilidad de realizar la comunicación via HTTP (de forma que únicamente se podrá enviar y recibir información de forma segura).

Para esto, puedes usar cualquiera de los certificados descritos a lo largo de la unidad 4. Sin pérdida de generalidad, y para que todos podamos hacer el mismo ejemplo, vamos a hacer el ejemplo sobre un certificado autofirmado, ya que no tiene requisitos previos.

Para esto, puedes usar tanto *KeyTool* (https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/keytool.html ) como *OpenSSL* (https://www.openssl.org/) para generar una de las 2 opciones de certificado siguientes: 
- *JKS*, que es un formato únicamente reconocido para Java
- *PKCS12*, que es un formato estandar para cualquier tipo de aplicación

La instrucción a ejecutar mediante KeyTool y los pasos que deberás de seguir para la generación se encuentran en las imágenes del repositorio *HowToJKS* y *HowToPKCS12*. Básicamente, en ambos casos implica la ejecución de keytool donde le informamos del alias a utilizar, el tipo de clave y su tamaño (RSA 2048), el tipo de clave y dónde guardarla (aquí es donde ambas opciones difieren), y la validez en días (10 años).

Una vez introducido esto, deberemos añadir también la información correspondiente a la organización y nombre del certificado (de forma que será quien está verificando que ese certificado es válido).

Una vez creados estos certificados, investiga qué opciones pueden añadirse en nuestro *application.properties* para permitir elegir y usar una clave específica de nuestro ordenador.


El resultado final es que tu aplicación debería funcionar a través de HTTPS, y no funcionar a través de HTTP.