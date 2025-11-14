package EjerciciosT1;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Escribe un programa que almacene la información de un producto
        // (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
        //Ejemplo de salida por consola:
        //INFORMACIÓN DEL PRODUCTO
        //--------------------------
        //Nombre: Auriculares Bluetooth
        //Precio: 29.99€
        //Código: AUR-2023
        //Disponible: true

        String nombreProducto ="Auriculares bluetooth";
        double precio = 29.99;
        String codigo ="AUR-2023";
        boolean disponibilidad = true;

        System.out.println("Nombre: " +nombreProducto);
        System.out.println("Precio: " +precio);
        System.out.println("Código: " +codigo);
        System.out.println("¿Está disponible?: " +disponibilidad);
    }
}
