import java.util.Scanner;

public class Ejercicio1Tem6 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase para obtener la primera letra en mayúsculas.");
        Scanner lector = new Scanner(System.in);
        String phrase = lector.nextLine();
        System.out.println(firstCapitalLetter(phrase));
        lector.close();
    }

    public static String firstCapitalLetter(String frase ) {
        return Character.toUpperCase(frase.charAt(0)) + frase.substring(1).toLowerCase();
    }
}