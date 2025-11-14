package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        //Escribe un programa que pida dos números al usuario
        // y muestre el resultado de todas las comparaciones relacionales entre ellos
        // (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
        //Ejemplo de salida por consola:
        //Introduce el primer número: 10
        //Introduce el segundo número: 10
        //¿10 es mayor que 10?: false
        //¿10 es menor que 10?: false
        //¿10 es igual a 10?: true
        //¿10 es diferente de 10?: false
        //¿10 es mayor o igual que 10?: true
        //¿10 es menor o igual que 10?: true

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un segundo número: ");
        int num2 = scanner.nextInt();

        boolean mayorQue = num1 > num2;
        boolean menorQue = num1 < num2;
        boolean igualQue = num1 == num2;
        boolean diferenteQue = num1 != num2;
        boolean mayorIgual = num1 >= num2;
        boolean menorIgual = num1 <= num2;


        System.out.println("¿Es " +num1+ " mayor que " +num2+ "?: " +mayorQue);
        System.out.println("¿Es " +num1+ " menor que " +num2+ "?: " +menorQue);
        System.out.println("¿Es " +num1+ " igual que " +num2+ "?: " +igualQue);
        System.out.println("¿Es " +num1+ " diferente que " +num2+ "?: " +diferenteQue);
        System.out.println("¿Es " +num1+ " mayor o igual " +num2+ "?: " +mayorIgual);
        System.out.println("¿Es " +num1+ " menor o igual " +num2+ "?: " +menorIgual);

        scanner.close();
    }
}
