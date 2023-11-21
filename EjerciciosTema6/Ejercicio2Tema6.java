import java.util.Scanner;

public class Ejercicio2Tema6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca una frase. ");
        String phrase = lector.nextLine();

        counter(phrase);

        lector.close();
    }

    public static void counter(String phrase) {
        int vocalCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);

            if (vocal(character)) {
                vocalCounter++;
            } else {
                consonantCounter++;
            }
        }

        System.out.println("Número de vocales: " + vocalCounter);
        System.out.println("Número de consonantes: " + consonantCounter);
    }

    public static boolean vocal(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
