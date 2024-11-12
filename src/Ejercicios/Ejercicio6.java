package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMenu(input);
        input.close();

    }
    // mostrar menu de conversion de unidades
    private static void showMenu(Scanner input) {
        int option;
        do {

            System.out.println("========================");
            System.out.println(" Conversión de Unidades ");
            System.out.println("========================");
            System.out.println("1. De metro a kilometro");
            System.out.println("2. De kilometro a metro");
            System.out.println("3. De gramo a kilogramo");
            System.out.println("4. De kilogramo a gramo");
            System.out.println("0. Salir de programa");
            System.out.print("Digita una opcion valida entre 0 - 4: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    resultkilometer(input);
                    break;
                case 2:
                    resultMeter(input);
                    break;
                case 3:
                    resultKilo(input);
                    break;
                case 4:
                    resultGram(input);
                    break;
                case 0:
                    System.out.println("Saliendo de programa....");
                    break;
                default:
                    System.err.println("opcion invalida ingrese solo  0 - 4");
                    break;
            }
            if (option != 0) {
                pressEnter(input);
            }
        } while (option != 0);
    }

    // conversion de kilo a gramo
    private static void resultGram(Scanner input) {
        System.out.println("Cuantos kilogramos quieres convertir a gramos");
        double kilogram = input.nextDouble();
        double result = kilogram *= 1000;

        Math.abs(kilogram);
        System.out.println(kilogram + " kilos son: " + result + " gramos");
        input.nextLine();
    }

    // conversion de gramo a kilo
    private static void resultKilo(Scanner input) {
        System.out.println("Cuantos gramos quieres convertir a kilogramos");
        double gram = input.nextDouble();
        double result = gram *= 0.001;
        Math.abs(gram);
        System.out.println(gram + " gramos son: " + result + " kilos");
        input.nextLine();
    }

    // presione enter para seguir
    private static void pressEnter(Scanner input) {
        System.out.println("Presiona un ENTER para continuar");
        input.nextLine();
    }

    // conversion de kilometro a metro
    private static void resultMeter(Scanner input) {
        System.out.println("Cuantos kilometros quieres convertir a metros");
        double kilometer = input.nextDouble();
        double result = kilometer *= 1000;

        Math.abs(result);
        System.out.println(kilometer + " kilometros son: " + result + " metros");
        input.nextLine();
    }

    // conversion de metro a kilometro
    private static void resultkilometer(Scanner input) {
        System.out.println("Cuantos metros quieres convertir a kilometro");
        double meter = input.nextDouble();

        double result = meter *= 0.001;
        Math.abs(result);
        System.out.println(meter + " metros son: " + result + " kilometros");
        input.nextLine();
    }
}
