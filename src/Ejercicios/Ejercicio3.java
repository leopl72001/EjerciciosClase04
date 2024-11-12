package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        resultFactorialCalculus(input);
        input.close();
    }
    //el resultado del calculo factorial
    private static void resultFactorialCalculus(Scanner input) {
        System.out.println("ingresa un numero entero positivo");
        var num = input.nextInt();
        if (num > 0) {
            long result = factorialCalculus(num);
            System.out.println("El factorial de "+num+" es: "+result);
        } else {
            System.out.println("dato ingresado invalido, ingresa un entero positivo");
        }
    }

    //calculo factorial
    private static long factorialCalculus(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
