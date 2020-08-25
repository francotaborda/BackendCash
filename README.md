BackendCash
--------------------------------------------------------------------------------
Como levantar el Backend:

Crear una base de datos en MySQL llamada: backend_cash
user: root
password:
(contraseña vacia)
De querer cambiar alguno de estos datos de la base de datos ingresar al application.properties dentro del proyecto y reemplazar los datos de la base de datos que deseé

Clonar repo:
https://github.com/francotaborda/BackendCash.git

Abrir Eclipse

File -> Import -> Existing Maven Project -> Navega hasta la carpeta donde realizaste el clone
Selecciona el projecto

Busca el Spring Boot Application file (search for @springbootapplication)
Click derecho sobre el archivo y Run as Java Application o presionala combinacion del teclado (shortcode) Alt+Shift+X -> Run Spring Boot App

--------------------------------------------------------------------------------
Carga inicial de datos:
Metodo 1:

En application.properties cambiar el valor none de spring.jpa.hibernate.ddl-auto a create para la carga de datos iniciales, correr la aplicacion, luego cambiar nuevamente dicho
dicho valor a update.

Metodo 2:

Dentro del proyecto hay una carpeta llamada dump, dentro de ella hay un archivo llamado dump.sql. copiar la informacion de este archivo y dentro de la base de datos pegar todo el contenido. Se crearan la tablas y se cargan con datos de prueba.
