package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        conversionSeconds(input);
        input.close();
    }

    // conversion de segundos
    private static void conversionSeconds(Scanner input) {
        System.out.println("Conversión de segundos\n");
        System.out.print("Ingresa la cantidad de segundos: ");
        var second = input.nextLong();
        long dias = second / 86400; // 86400 segundos en un día
        long horas = (second % 86400) / 3600; // 3600 segundos en una hora
        long minutos = (second % 3600) / 60; // 60 segundos en un minuto
        long segundos = second % 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
