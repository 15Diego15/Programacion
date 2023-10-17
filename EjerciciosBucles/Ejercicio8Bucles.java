import java.util.Scanner;

public class Ejercicio8Bucles {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2 = 0;
        int result;
        System.out.println("Ingrese un número entero");
        num1 = lector.nextInt();
        lector.nextLine();
        lector.close();
   
        for( num1 = num2; num1<= num2; num1 = num1 - 1){
            num1 = num1 * num2;
            
        }
        result = num1;
        System.out.println("El resultado de su factorial es: " + result);
    }
}
