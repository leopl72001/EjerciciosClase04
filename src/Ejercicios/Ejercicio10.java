package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        multiplicationTable(input);
        input.close();

    }
    //metodo para multiplicar 
    private static void multiplicationTable(Scanner input) {
        System.out.print("\nIngrese el número para generar la tabla: ");
        var num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (num > 0) {
                var result = num * i;
                System.out.printf("%d x %d = %d%n", num, i, result);
            } else {
                System.err.println("Ingrese solo numeros positivos");
            }
        }
    }
}
