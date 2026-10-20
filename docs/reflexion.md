# Reflexión sobre la Actividad: Sistema Saludador

## Retos
Uno de los principales retos fue estructurar el proyecto de forma que no fuera un dolor de cabeza ejecutarlo. Al principio, intentar compilar JavaFX a mano genera muchos errores por los módulos (`module-info.java`) y las variables de entorno. La solución fue utilizar Maven con el plugin de JavaFX, así se delega toda esa configuración aburrida a la herramienta y se puede correr el código directo con un solo comando en la consola. Otro reto fue aterrizar el diagrama de casos de uso de la pizarra a una interfaz gráfica que tuviera sentido.

## Descubrimientos y Sorpresas
Me sorprendió mucho lo útil que es la IA (Cursor en este caso) para agilizar la parte visual. No solo generó rápido los campos de texto, sino que me ayudó a entender cómo manejar los eventos del botón usando Lambdas (`e -> { ... }`) en lugar de escribir funciones enormes. Además, me pareció un buen descubrimiento el hecho de poder inyectarle estilos como si fuera CSS (`-fx-background-color`, `-fx-font-weight`) directo a los componentes para que no se viera tan anticuada la ventana.

## Estructura del Software
Para no complicar el proyecto, la aplicación sigue una estructura monolítica sencilla, donde todo pasa en la clase `Main.java` (que hereda de la clase `Application` de JavaFX). 
- Se utilizó un contenedor de tipo `VBox` para apilar los elementos verticalmente de forma ordenada.
- Toda la lógica de negocio (las validaciones de campos vacíos y la lógica de si es AM o PM) está contenida y se dispara únicamente con el evento del botón "Solicitar saludo".

## Comandos y Librerías 
- **Librerías principales**: `javafx.scene.control.*` (para sacar componentes como TextField, ComboBox y Button) y `javafx.geometry.Insets` para los márgenes.
- **Comandos comprendidos**: El comando salvavidas fue `mvn clean compile javafx:run`, que me evitó tener que pelear con las rutas del JDK al momento de ver los resultados en pantalla.
- 
