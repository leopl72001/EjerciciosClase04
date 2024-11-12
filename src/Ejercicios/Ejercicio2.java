package Ejercicios;

import java.util.Scanner;

//Verificación de Palíndromos
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        palindromeCheck(input);
        input.close();

    }
    //comprobocacion de palindromos
    private static void palindromeCheck(Scanner input) {
        System.out.print("Ingrese una cadena para verificar si es un palíndromo: ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

    //convertir cadena a palindromo
    private static boolean isPalindrome(String str) {
        // Convertimos la cadena a minúsculas y eliminamos caracteres especiales
        String cleanedStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // Invertimos la cadena
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

}
