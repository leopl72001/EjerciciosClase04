package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMenu(input);
        input.close();
    }

    // menu de calculadora de intereses
    private static void showMenu(Scanner input) {
        byte option;
        do {
            System.out.println("==========================");
            System.out.println(" Calculadora de intereses ");
            System.out.println("==========================");

            System.out.println("1. Interes simple");
            System.out.println("2. Interes compuesto");
            System.out.println("0. Salir del programa" + "\n");
            System.out.print("Ingresa una opcion: ");
            option = input.nextByte();

            switch (option) {
                case 1:
                    simpleInterest(input);
                    break;
                case 2:
                    compoundInterest(input);
                    break;
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.err.println("Opcion invalida, ingresa solo entre 0 - 2");
                    break;
            }
            if (option != 0) {
                pressEnter(input);
            }
        } while (option != 0);
    }

    // interes compuesto
    private static void compoundInterest(Scanner input) {
        System.out.print("Ingresa el monto de capital: ");
        double p = input.nextDouble();
        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double r = input.nextDouble();
        System.out.print("Ingresa el tiempo (en años): ");
        byte t = input.nextByte();
        System.out.print("Ingresa el número de veces que se aplica el interés por año: ");
        byte n = input.nextByte();

        double a = p * Math.pow(1 + (r / 100 / n), n * t);

        System.out.println("\nEl monto total después de " + t + " años es: " + a);
        System.out.println("El interés compuesto es: " + (a - p));
        input.nextLine();
    }

    // interes simple
    private static void simpleInterest(Scanner input) {
        System.out.print("Ingresa el capital inicial: ");
        double p = input.nextDouble();
        System.out.print("Ingresa la tasa de interes anual: ");
        double r = input.nextDouble();
        System.out.print("Ingresa el tiempo (en años): ");
        byte t = input.nextByte();

        double i = p * (r / 100) * t;

        System.out.println("\nEl interes simple es de: " + i);
        input.nextLine();

    }

    // presionar enter para continuar
    private static void pressEnter(Scanner input) {
        System.out.println("\nPresiona ENTER para continuar");
        input.nextLine();
    }
}
