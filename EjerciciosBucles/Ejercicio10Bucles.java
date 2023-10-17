import java.util.Scanner;

public class Ejercicio10Bucles {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int contador = 0;
        do {
            System.out.println("Escribe un número");
            num1 = lector.nextInt();
            contador += num1;
        } while (num1 != 0);
        System.out.println("La suma total da: " + contador);
        lector.close();
    }
}
