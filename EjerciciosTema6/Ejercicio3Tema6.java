import java.util.Scanner;

public class Ejercicio3Tema6 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase");
        Scanner lector = new Scanner(System.in);
        String phrase = lector.nextLine();
        System.out.println(counter(phrase));
        lector.close();
    }

    public static String counter(String phrase) {
        int counterI = 0;
        for(int i = 0; i < phrase.length(); i++) {
            counterI++;
        }
        String counterS = "" + counterI;
        return counterS;
    }
}
