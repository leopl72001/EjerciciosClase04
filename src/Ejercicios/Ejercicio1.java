package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    // Conversión de Temperaturas
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        showMenu(input);
        input.close();

    }

    // menu de conversion
    private static void showMenu(Scanner input) {
        int option;
        do {
            System.out.println("==================================");
            System.out.println(" Conversion de temperaturas");
            System.out.println("==================================");
            System.out.println("1. Convertir Celsius a Fahrenheit");
            System.out.println("2. Convertir Fahrenheit a Celsius");
            System.out.println("0. Salir del programa");
            System.out.print("Ingresa tu opcion: ");
            option = input.nextInt();
            input.nextLine();// limpiar el buffer

            switch (option) {
                case 1:
                    convertFahrenheit(input);
                    System.out.println("");
                    break;
                case 2:
                    convertCelsius(input);
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.err.println("Digitacion invalida ingrese solo una opcion entre"
                            + " 0 - 1");
                    break;
            }
            if (option != 0) {
                pressEnter(input);
            }
        } while (option != 0);
    }

    // conversion de fahrenheit a celsius
    private static void convertCelsius(Scanner input) {
        System.out.print("\ncuantos Fahrenheit quieres convertir a Celsius: ");
        double fahrenheit = input.nextDouble();
        // conversion de fahrenheit a celsius
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println("\nTemperatura en Celsius: " + celsius + " °C");
        input.nextLine();
    }

    // conversion de Celcius a Fahrenheit
    private static void convertFahrenheit(Scanner input) {
        System.out.print("\nCuantos Celsius quieres convertir a Fahrenheit: ");
        double celsius = input.nextDouble();
        // conversion de celsius a fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\nTemperatura en Fahrenheit: " + fahrenheit + "°F");
        input.nextLine();
    }

    // ENTER para continuar
    private static void pressEnter(Scanner input) {
        System.out.println("presione ENTER para continuar");
        input.nextLine();

    }

}
