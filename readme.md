# Ejercicio 1

En este ejercicio vamos a crear una serie de endpoints para ver comprender en mayor profundidad cómo funciona Spring y qué posibilidades tiene.

Sobre cada apartado, deberás comprobar, una vez implementado, que, al consultar en tu navegador sobre tu localhost, con el puerto sobre el que esté lanzada la API, y en la dirección especificada en cada apartado, se devuelven los datos esperados.

## 1. Hello World!

Al hacer un GET sobre "/hi", devolver "Hello World"

## 2. Bye World!

Al hacer un GET sobre "/bye", devolver "Bye World"

## 3. Long string formatted

Al consultar /longstring, devolver un string, separado por intros, que ponga “Escribiendo número i”, siendo i el número.

_NOTA (para investigar): ¿por qué crees que es necesario que se separe por <br>, que serían tags html, frente a otras opciones?_

## 4. Integer list

Al consultar /intList, devolver un array de los números del 1 al 5

_NOTA: comprueba que no es necesario que siempre se devuelva un string en estos métodos, si no que Spring ya serializa los tipos más complejos automáticamente_

## 5. Secuencia de Fibonacci de N elementos

Al consultar /fibonacci/{numElements}, devolver un array de los N primeros elementos de la secuencia de fibonacci.

## 6. Secuencia de Fibonacci de N elementos en formato tabla

Al consultar /fibonacci/{numElements}/table, devolver un array de los N primeros elementos de la secuencia de fibonacci en formato de tabla, con 4 elementos por fila (la última fila tendrá los elementos que queden).

PISTAS: 
- No hacer copy/paste, ya tenéis hecho el código que hace la parte de devolver los N primeros elementos en el apartado anterior :-]
- Para montar una tabla, usad el elemento HTML <table> 

## 7. Usar template HTML

Usar un endpoint + template HTML que te salude con tu nombre (siendo este último un parámetro)