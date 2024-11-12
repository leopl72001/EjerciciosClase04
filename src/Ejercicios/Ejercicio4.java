package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        comprobation(input);
        input.close();
    }

    // reslutado
    private static void comprobation(Scanner input) {
        System.out.println("Ingresa un numero entero para comprobar si es primo o no");
        var num = input.nextInt();

        System.out.println("¿Es " + num + " un número primo? " + isPrimo(num));
    }

    // metodo para comprobar el numero primo
    private static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
