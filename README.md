# PrimeFaces12-template
Proyecto JAVA web con JSF y la libreria Prime Faces en su version 12. 
Incluye implementacion de plantilla css para el login y admin template, 
manejo de sesiones de seguridad, persistencia de datos y diseños responsive para cruds.


## Especificaciones del proyecto
| Recursos | Version |
| ------ | ------ |
| JAVA | JDK 1.8 |
| JAVA EE | 7 web |
| JSF | 2.2 |
| Primefaces | 8.0 |
| GlassFish Server | 4.1.1 |
| MariaDB | 10.4.27 |
| NetBeans IDE | 8.2 |


## Tecnologias utilizadas
| Recursos |
| ------ |
| JSF |
| JPA | 
| EJB |
| JAX WS (for Rest API) |
| MySQL |


## Installation

Descarga de proyecto con git
```sh
git clone https://github.com/stephen-tif/PrimeFaces12-template.git
cd PrimeFaces12-template
git checkout master
```

**En la raiz del proyecto se encuentra el script inicial de la base de datos MySQL _primefaces12.sql_**

_Abrir proyecto con NetBeans IDE 8.2 de preferencia..._

- Se debe configurar configurar el pool de conexion y posteriormente verificar la conectividad en el archivo _persistence.xml_
- La aplicacion se debera ejecutar de preferencia en el servidor de aplicaciones GlassFish debido a que fue configurado inicialmente en este, sin embargo, se podria configurar en cualquier otro si asi se desea.