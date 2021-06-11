# Taller-Solid
##### Analice las siguientes partes del código, explique su análisis en el archivo README.md y corrija el código para que cumpla con los principios SOLID.
La clase ***OperacioneAderezo*** no cumple con el principio **SRP** por lo que se opto por hacer 2 Interfaces ***AderezoHelado*** y ***AderezoPastel*** la cual cada una tiene el método añadir y quitar respectivamente.


![image](https://user-images.githubusercontent.com/74307558/121625846-e6db2400-ca39-11eb-81ca-29a2e86d6b76.png)


![image](https://user-images.githubusercontent.com/74307558/121625994-2dc91980-ca3a-11eb-9e95-6be84625127b.png)



------------

##### 2.Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.
La clase ***OperacionesAderezo*** fue eliminada por que no cumplía el principio SRP  por lo cual se creo las interfaces ***AderezoHelado*** y ***AderezoPastel*** que manipulan el agregado y eliminado del aderezo respectivamente.
