import java.util.Scanner;

public class Ejercicio14Tema6 {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        char[] datos = new char[10];
        solicitarDatosArray(datos);
        imprimirImpar(datos);
    }

    public static void solicitarDatosArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d]\n", i);
            array[i] = lector.nextLine().charAt(0);
        }
    }

    public static void imprimirImpar(char[] array) {
        for (int i = 1; i < array.length; i ++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
