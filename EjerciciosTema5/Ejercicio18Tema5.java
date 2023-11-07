import java.util.Scanner;
public class Ejercicio18Tema5 {
    public static void main(String[] args) {

        int dni = solicitarDNI();
        System.out.println(calcularNIF(dni));
    }
    public static int solicitarDNI() {
        int DNI;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su DNI, importante que no contenga la letra");
        DNI = lector.nextInt();
        lector.close();
        return DNI;
    }
    public static String calcularNIF(int DNI) {

        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE"; 
        int modulo= DNI % 23;
        char letra = juegoCaracteres.charAt(modulo); 
        
        return Integer.toString(DNI) + letra;
    }
}
