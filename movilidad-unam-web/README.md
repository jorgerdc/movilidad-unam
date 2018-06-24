## movilidad-unam-web
1. Lineamientos de programación recomendados.
	* Descargar el documento de lineamientos generales de programación del siguiente
  [enlace](https://drive.google.com/open?id=1mkrT1ZZFNAUtTvskoIefzD2eNjpiZPXG)
	* Existe ya un workspace configurado con todas las instrucciones de este
  documento.  El archivo se puede descargar [aquí](https://drive.google.com/open?id=1mdqOa7Brr0uU-txOTFyCVUUjlHVDTZPR)
	* Se recomienda emplear la IDE STS. Descargar [aquí](https://spring.io/tools/sts/all)
  
2. Pasos a seguir para construir y probar
	* Instalar Git en la máquina donde se va a desarrollar ( en caso de no estar instalado).  En Ubuntu se puede instalar git fácilmente ejecutando  ```sudo apt-get install git``` 
	* Cambiarse a un directorio en el que se hará la descarga del proyecto.
	* Clonar el proyecto:
```bash d 

	* Importar el proyecto desde la IDE:  ``` File -> Import ```
   Seleccionar  ```Existing projects into Workspace```
	* Verificar que no existan problemas de compilación.

3. Para construir y ejecutar la aplicación web desde terminal:
	* Abrir una terminal y cambiarse al directorio donde se encuentra el proyecto.
	* Ejecutar  ```./gradlew build```
	* No es necesario instalar gradle en la máquina.

4. Para iniciar la app web:
	* Ejecutar   ```./gradlew appRun```
	* Abrir un navegador en la página que se indica en la salida de la terminal:
	* http://localhost:8080/movilidad-unam-web/

5. Para comenzar con el desarrollo de la app Web empleando Spring Core, Spring MVC, revisar el siguiente [demo](https://github.com/jorgerdc/spring/tree/master/spring-jquery-web)




  


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTEwNzY3MzI2NjMsMTIxNjcxMDE2NCwxMz
c3MDA5MTk4LDk3MDA3ODM1MSwyMjUwOTU3OTUsMTMwNTI4NDQ1
XX0=
-->