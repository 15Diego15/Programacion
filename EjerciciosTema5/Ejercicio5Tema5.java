import java.util.Scanner;

public class Ejercicio5Tema5 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String cadena = print('a', 3);
        System.out.println(cadena);
        lector.close();
    }

    public static String print(char c, int times) {
        String result = "";
        for (int i = 1; i <= times; i++)
            result = result + c;
        return result;

    }

}
