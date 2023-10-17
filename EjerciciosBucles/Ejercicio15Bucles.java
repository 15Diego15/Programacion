import java.util.Scanner;

public class Ejercicio15Bucles {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int h, m, s;
        System.out.println("Escriba una hora");
        h = lector.nextInt();
        System.out.println("Escriba unos minutos");
        m = lector.nextInt();
        System.out.println("Escriba una segundos");
        s = lector.nextInt();
        System.out.println(h + ":" + m + ":" + s);
        if (h < 24 && h >= 0
                && m >= 0 && m <= 60
                && s >= 0 && s <= 60) {
            System.out.println("La hora es correcta ");
        } else {
            System.out.println("La hora es incorrecta ");
        }
        lector.close();

    }
}
