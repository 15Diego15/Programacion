import java.util.Scanner;
public class Ejercicio1Ansi {
    public static void main(String[] args){
        double numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número real");
        numero = lector.nextDouble();
        lector.close();
        
        String numeroFormateado = String.format("%.2f", numero);
        System.out.println("El número con dos decimales es: " + numeroFormateado);
    
    }
}