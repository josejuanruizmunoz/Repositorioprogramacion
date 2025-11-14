package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio1 {
     static void main(String[] args) {
        //Crea un programa que pida al usuario dos números enteros por consola
        // y muestre el resultado de las cinco operaciones aritméticas básicas:
        // suma, resta, multiplicación, división y módulo (resto).
        //Ejemplo de salida por consola:
        //Introduce el primer número: 15
        //Introduce el segundo número: 4
        //Suma: 19
        //Resta: 11
        //Multiplicación: 60
        //División: 3
        //Módulo (resto): 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;



        System.out.println("Suma: " +suma);
        System.out.println("Resta: " +resta);
        System.out.println("Multiplicación: " +multiplicacion);
        System.out.println("División: " +division);
        System.out.println("Módulo(resto): " +modulo);

        scanner.close();
    }
}
