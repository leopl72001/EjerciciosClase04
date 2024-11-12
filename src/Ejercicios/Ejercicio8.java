package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMenu(input);
        input.close();
    }

    // menu
    private static void showMenu(Scanner input) {
        byte option;
        do {
            System.out.println("======================================");
            System.out.println("         Calculadora de area   ");
            System.out.println("======================================");
            System.out.println("1. Calcular el area de un cuadrado");
            System.out.println("2. Calcular el area de un circulo");
            System.out.println("3. Calcular el area de un triangulo");
            System.out.println("0. Salir del programa\n");
            System.out.print("Ingrese la opcion: ");
            option = input.nextByte();
            System.out.println("");
            input.nextLine();

            switch (option) {
                case 1:
                    CalculateSquareArea(input);
                    break;
                case 2:
                    calculateCircleArea(input);
                    break;
                case 3:
                    calculateTriangleArea(input);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("opcion invalida, ingresa solo entre 0 - 3");
                    break;
            }
            if (option != 0) {
                pressEnter(input);
            }
        } while (option != 0);

    }

    // area del cuadrado
    private static void CalculateSquareArea(Scanner input) {
        System.out.print("Ingresa la longitud del lado del cuadrado: ");
        double lado = input.nextDouble();

        // Calcular el área
        double area = Math.pow(lado, 2);

        System.out.println("El área del cuadrado es: " + area + "\n");
        input.nextLine();
    }

    // area del circulo
    private static void calculateCircleArea(Scanner input) {
        System.out.print("Ingresa el radio del circulo: ");
        double r = input.nextDouble();
        // Calcular el área
        double area = 3.1416 * Math.pow(r, 2);
        System.out.println("El area del circulo es: " + area + "\n");
        input.nextLine();
    }

    // area del triangulo
    private static void calculateTriangleArea(Scanner input) {
        System.out.print("Ingresa la base del triangulo: ");
        double b = input.nextDouble();
        System.out.print("Ingresa la altura del triangulo: ");
        double h = input.nextDouble();

        // Calcular el área
        double area = (b * h) / 2;
        System.out.println("El area del triangulo es: " + area + "\n");
        input.nextLine();
    }

    // presionamos enter para continuar
    private static void pressEnter(Scanner input) {
        System.out.println("presiona ENTER para continuar");
        input.nextLine();
    }
}
