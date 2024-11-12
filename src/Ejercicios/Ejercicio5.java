package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getResult(sc);
        sc.close();
    }

    // resultado
    private static void getResult(Scanner sc) {

        double result = average(sc);
        System.out.println("El promedio es: " + result);

    }

    // promedio
    private static double average(Scanner sc) {
        System.out.println("Ingresa 3 numeros para hallar el promedio");
        System.out.print("Ingresa el 1er numero: ");
        var num1 = sc.nextDouble();
        System.out.print("Ingresa el 2do numero: ");
        var num2 = sc.nextDouble();
        System.out.print("Ingresa el 3er numero: ");
        var num3 = sc.nextDouble();
        return (num1 + num2 + num3) / 3;
    }

}