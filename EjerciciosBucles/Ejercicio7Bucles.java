import java.util.Scanner;

public class Ejercicio7Bucles {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double a;
        int b;
        double result;
        System.out.println("Escribe un número real");
        a = lector.nextDouble();
        lector.nextLine();
        System.out.println("Escribe un número entero");
        b = lector.nextInt();
        lector.nextLine();
        lector.close();
        result = a * b;
        System.out.println("El resultado de la operación es: " + result);
    }
}
