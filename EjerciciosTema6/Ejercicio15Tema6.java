/*
 *  Escribe un programa que permita introducir un array de 20 elementos numéricos y visualizarlos
    de 4 en 4 en una tabla tabulada.
 */

import java.util.Scanner;

public class Ejercicio15Tema6 {

    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        int[] datos = new int[20];
        
        formato(datos, 4);

    }

    public static void solicitarDatosArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d]\n", i);
            array[i] = Integer.parseInt(lector.nextLine());
        }
    }
    public static void formato(int[] array, int columnas) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t%d\t", i, array[i]);
        }
    }

}