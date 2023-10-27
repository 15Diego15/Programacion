import java.util.Scanner;

public class Ejercicio7Tema5 {
    public static void main(String[] args) {
        int num1;
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        num1 = lector.nextInt();
        lector.close();
        int factorialFinal = factorial(num1);
        System.out.println("El factorial de su número es: " + factorialFinal);

    }

    public static int factorial(int num) {
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor = factor * i;
        }
        return factor;
    }

}
