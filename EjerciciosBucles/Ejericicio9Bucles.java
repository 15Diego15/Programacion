import java.util.Scanner;

public class Ejericicio9Bucles {
     public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int a;
        System.out.println("Escribe un número Entero");
        a = lector.nextInt();
        lector.nextLine();
        lector.close();
        if (a % 2 == 0 && a % 3 == 0){
            System.out.println("El número no es primo");
        } else{
            System.out.println("El número es primo");
        }
    }
}