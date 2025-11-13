public class Ejercicio5 {
    public static void main(String[] args) {
        //Crea un programa que use constantes para almacenar
        // información que no debe cambiar (como el valor de PI o el nombre de una aplicación) y
        // variables para información que puede cambiar. Muestra todos los valores.
        //Ejemplo de salida por consola:
        //Aplicación: MiApp
        //Versión: 1.0.0
        //Valor de PI: 3.14159
        //Usuario actual: Laura
        //Nivel: 1
        //Puntuación: 0
        //Usuario actualizado: Miguel
        //Nivel actualizado: 2
        //Puntuación actualizada: 150

        final String NOMBRE_APLICACION =" MiApp";
        final String VERSION ="1.0.0";
        final double PI = 3.14159;

        String usuarioActual =" Laura";
        int nivel = 1;
        int puntuacion =0;

        System.out.println("Aplicación:" +NOMBRE_APLICACION);
        System.out.println("Versión: " +VERSION);
        System.out.println("PI: " +PI);
        System.out.println("Usuario actual:" +usuarioActual);
        System.out.println("Nivel: " +nivel);
        System.out.println("Puntuación: " +puntuacion);

        usuarioActual = "Sergi";
        nivel = 2;
        puntuacion = 1;

        System.out.println("Usuario actual: " +usuarioActual);
        System.out.println("Nivel: " +nivel);
        System.out.println("Puntuación: " +puntuacion);
    }
}
