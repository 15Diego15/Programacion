import java.util.Scanner;

public class Ejercicios11Bucles {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        double contador = 0;
        int num2 = 0;
        do {
            System.out.println("Escribe un número");
            num1 = lector.nextInt();
            num2 = num2 + 1;
            contador = contador + num1;

        } while (num1 > -1);
        contador = contador / num2;
        System.out.println("la media es: " + contador);
        lector.close();
    }
}