import java.util.Scanner;

public class Ejercicio6Tema5 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String cadena = print('a', 5, 2);
        System.out.println(cadena);
        lector.close();
    }

    public static String print(char c, int times, int columns) {
        String result = "";
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= times; j++) {
                result = result + c;
            }
            result += "\n";
        }

        return result;

    }

}
