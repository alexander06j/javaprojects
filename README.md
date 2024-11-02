- Los objetivos y propósito del proyecto.
El objetivo general del proyecto es modelar una estructura de clases que represente diferentes tipos de contenido audiovisual para organizar y gestionar la información relevante de cada tipo de contenido de manera eficiente en un sistema de gestión o catálogo multimedia.

- Las clases y funcionalidades nuevas añadidas
Se han añadido funcionalidades como la adición de nuevas subclases, como Cortometraje y VideoMusical, demuestra que el sistema es fácilmente ampliable. Nuevos tipos de contenido se pueden agregar sin afectar la estructura básica, gracias a la flexibilidad de la herencia y el diseño basado en clases abstractas.
Esta estructura de clases facilita la implementación de funcionalidades en el sistema, como la búsqueda, organización y clasificación del contenido audiovisual por tipo, director, cantante, actores, etc., que son atributos comunes y específicos en cada subclase.

- Instrucciones para clonar y ejecutar el proyecto.
 Pre-requisitos
Asegúrate de tener instalados los siguientes programas:
Git: Para clonar el repositorio. Java Development Kit (JDK) versión 11 o superior.
1.	Clonar repositorio
Abrir la terminal de git o consola de comandos y ejecuta el siguiente código para clonar el repositorio en tu maquina local: 
git clone https://github.com/alexander06j/javaprojects.git

2.	Navegar al directorio del proyecto:
Cambia de directorio a la carpeta del proyecto que acabas de clonar:
cd javaprojects

3.	Compilar el proyecto:
compilar el proyecto manualmente con el siguiente comando:
mvn compile 

4.	Ejecutar la aplicación
Ejecutar desde el archivo jar:
java -jar target/nombre-del-archivo.jar
Nota: Reemplaza nombre-del-archivo.jar con el nombre del archivo .jar generado en la carpeta target.

- Mejoras adicionales:
Se añadieron comentarios y documentación en el código para explicar la funcionalidad del programa, lo que facilita el entendimiento para otros desarrolladores que trabajen en el proyecto.
