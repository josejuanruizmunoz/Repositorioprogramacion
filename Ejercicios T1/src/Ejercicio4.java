public class Ejercicio4 {
    public static void main(String[] args) {
        //Crea un programa que simule la información de un
        // libro usando variables con nombres descriptivos.
        // Muestra toda la información del libro en la consola.
        //Ejemplo de salida por consola:
        //Título: Don Quijote de la Mancha
        //Autor: Miguel de Cervantes
        //Año de publicación: 1605
        //Número de páginas: 863
        //¿Disponible en biblioteca?: true

        String titulo ="Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int añoPublicacion = 1605;
        int numeroPaginas = 863;
        boolean disponibilidad = true;

        System.out.println("Título: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Se publicó en: " +añoPublicacion);
        System.out.println("Tiene: " +numeroPaginas+ " páginas");
        System.out.println("Está disponible en la biblioteca: " +disponibilidad);
    }
}
