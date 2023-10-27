import java.util.Scanner;

public class Ejercicio8Tema5 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el número 1: ");
        num1 = lector.nextInt();
        System.out.print("Introduce el numero 2: ");
        num2 = lector.nextInt();
        System.out.print("Introduce el numero 3: ");
        num3 = lector.nextInt();
        System.out.print("Introduce el numero 4: ");
        num4 = lector.nextInt();

        lector.close();
        int capicuafinal = capicua(num1, num2, num3, num4);
        System.out.println();
        while (num1 == num4 && num2 == num3) {
            System.out.print(capicuafinal + ". Es capicua");
        }
        while (num1 != num4 || num2 != num3) {
            System.out.print(capicuafinal + ". No es capicua");
        }

    }

    public static int capicua(int num1, int num2, int num3, int num4) {
        return capicua(num1, num2, num3, num4);

    }

}
