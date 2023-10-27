import java.util.Scanner;

public class Ejercicio9Tema5 {
    public static void main(String[] args) {
        int num1;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        num1 = lector.nextInt();
        lector.close();
        int sumatorioFinal = sumatorio(num1);
        System.out.println("El sumatorio de su número es: " + sumatorioFinal);
        lector.close();
    }

    public static int sumatorio(int contador) {
        int suma = 0;

        while (contador != 0) {
            suma = suma + contador;
            contador--;
        }
        return contador;

    }

}
