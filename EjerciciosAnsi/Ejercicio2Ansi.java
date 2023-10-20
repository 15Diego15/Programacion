import java.util.Scanner;

public class Ejercicio2Ansi {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int h, m, s;
        System.out.println("Ingrese una hora");
        h = lector.nextInt();
        System.out.println("Ingrese unos minutos");
        m = lector.nextInt();
        System.out.println("Ingrese una segundos");
        s = lector.nextInt();

        lector.close();

        String formato = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println("La hora en formato hh:mm:ss es: " + formato);
    }
}
