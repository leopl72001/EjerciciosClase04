package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        potencia(input);
        input.close();
    }

    // calculadora de potencia
    private static void potencia(Scanner input) {
        System.out.println("calculadora de potencias ");
        System.out.print("ingresa la base: ");
        var ba = input.nextInt();
        System.out.print("ingresa el exponente: ");
        var ex = input.nextInt();

        if (ex == 0) {
            System.out.println("Cualquier número elevado a 0 es igual a 1.");
            System.out.println("El resultado es: 1");
        } else {

            double result = Math.pow(ba, ex);
            System.out.println("La potencia de " + ba + " elevado a " + ex + " es igual a: " + result);
        }
    }
}
