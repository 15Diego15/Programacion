import java.util.Scanner;
public class Ejercicio17Tema5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int widht, height;
        String character;
        System.out.println("Ingrese el número de columnas que desea");
        widht = lector.nextInt();
        System.out.println("Ingrese el número de filas que desea");
        height = lector.nextInt();
        System.out.println("Ingrese el caracter que desea imprimir");
        character = lector.next();
        lector.close();
        System.out.println("______________________");
        rectangle(widht, height, character);
    }
    public static void rectangle(int widht, int height, String character) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < widht; j++) {
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}
