import java.lang.reflect.Array;
import java.util.Scanner;
public class Ejercicio13Tema6 {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int[] datos = new int [10];
        solicitarDatosArray(datos);
        System.out.printf("La media es %.2f\n", mediaArray(datos));
    }

    public static void solicitarDatosArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d]\n", i);
            array[i] = Integer.parseInt(lector.nextLine());
        }
    }
    public static float mediaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (float)suma / array.length;
    }

}
