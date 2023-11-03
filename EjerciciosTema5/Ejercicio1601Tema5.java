import java.util.Scanner;

public class Ejercicio1601Tema5 {

    static private final int MIN = 0;
    static private final int MAX = 9999;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numeroCambiar;
        String letraCambiar;
        System.out.println("Ingrese el número que desea cambiar ( 0-9) ");
        numeroCambiar = lector.nextInt();
        if (numeroCambiar < 0 || numeroCambiar > 9) {
            do {
                System.out.println("El número debe estar entre 0 y 9");
                numeroCambiar = lector.nextInt();
            } while (numeroCambiar < 0 || numeroCambiar > 9);
        }

        System.out.println("Ingrese la letra por la cual quiere hacer el cambio");
        letraCambiar = lector.next();
        System.out.println(letraCambiar);
        lector.close();
        contador(String.valueOf(numeroCambiar), letraCambiar);
    }

    public static void contador(String num, String letra) {
        for (int i = MIN; i <= MAX; i++) {
            String number = String.format("%04d", i);
            String numberWithFormar = number.replaceAll(num, letra);
            System.out.println(numberWithFormar);
        }
    }
}
