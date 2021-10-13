# PARCIAL2-AREP

## Introducción

En este segundo parcial se realizo:

  1. Se creó un servicio que realiza operaciones segun lo que se nos asigno.
  2. El servicio se encuentran en DockerHub.
  3. Se desplego este servicio en un contenedor Docker que se encuentra en una maquina virtual de EC2.
 
## Servidor Operation

Este servicio es el encargado de realizar una operación segun la uri que le pasen y el valor del parametro, en mi caso soy "0 = log" y "5 = acos"

**/log:** nos devuelve en formato JSON la operación log realizada

![](img/Captura4.PNG)

**/acos:** nos devuelve en formato JSON la operación acos realizada

![](img/Captura5.PNG)

## Docker

El servicio tiene un archivo DockerFile que se encarga de construir la imagen para poderla subir al DockerHub, Se le pasaron las clases y las dependencias que necesita al contenedor.

![](img/Captura9.PNG)

El servicio esta en el contenedor julitom1/parcial2-arep

![](img/Captura2.PNG)

## AWS

En AWS se creo una maquina virtual y se creo un archivo docker-compose.yml que descarga el contenedor de el repositorio de dockerHub, construye las respectivas imagenes y las pone a correr en el puerto indicado, en este caso en el 5000.

![](img/captura6.PNG)

Para finalizar se habilito el puerto 5000 unicamente

![](img/Captura1.PNG)


#### Contenedores ejecutandose

![](img/Captura7.PNG)

#### Mirando dentro del contenedor

![](img/Captura8.PNG)

#### probando puerto 5000

![](img/Captura3.PNG)

## Diagrama de despliegue

![](img/Captura14.PNG)

## Video demostrativo

https://www.youtube.com/watch?v=rZT6I8MmrR8

## Autor

Yarit Yajanny Villalobos Jimenez
