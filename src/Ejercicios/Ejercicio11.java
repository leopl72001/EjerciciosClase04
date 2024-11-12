package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        imcCalculator(input);
        input.close();
    }

    private static void imcCalculator(Scanner input) {
        System.out.println("Calculadora IMC (Indice de masa muscular)");
        System.out.print("\nIngresa tu peso en kilogramos: ");
        short weight = input.nextShort();

        System.out.print("Ingresa tu altura en metros: ");
        double height = input.nextFloat();

        double imc = weight / Math.pow(height, 2);
        double imcRedondeado = Math.round(imc * 100.0) / 100.0;
        System.out.println("Tu IMC es: " + imcRedondeado);
        if (imc <= 18.5) {
            System.out.println("Categoria: Bajo peso");
        } else if (imc <= 24.9 && imc <= 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (imc <= 29.9 && imc <= 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else if (imc <= 34.9 && imc <= 34.9) {
            System.out.println("Categoria: Obesidad Grado I");
        } else if (imc <= 39.9 && imc <= 39.9) {
            System.out.println("Categoria: Obesidad Grado II");
        } else if (imc > 40.1) {
            System.out.println("Categoria: Obesidad Grado III");
        } else {
            System.err.println("solo numeros positivos");
        }
    }
}
