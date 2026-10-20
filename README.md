# Sistema Saludador

Este repositorio contiene la solución al Modelo de Requerimientos, desarrollada como una aplicación de escritorio con Java y JavaFX.

## Estructura del Repositorio
- `/src`: Código fuente de la aplicación en Java.
- `/prompts`: Contiene el archivo `prompts.txt` con la secuencia de interacciones con la IA utilizada para el desarrollo.
- `/docs`: Contiene el archivo `reflexion.md` con el análisis del desarrollo de la actividad.
- `pom.xml`: Archivo de configuración para gestionar las dependencias y la ejecución de forma sencilla.

## Requisitos Previos
- Tener instalado el **JDK 17** (o superior).
- Tener instalado **Maven**.

## Cómo ejecutar la aplicación
1. Abre tu terminal o consola y ubícate en la carpeta donde clonaste el repositorio.
2. Ejecuta el siguiente comando para limpiar y compilar:
   mvn clean compile
3. Ejecuta el siguiente comando para levantar la aplicación gráfica:
   mvn javafx:run
   
