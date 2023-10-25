import java.util.Scanner;

public class Ejercicio2Tema5 {

    public static void main(String[] args) {

        // Fórmula del diámetro de una circuferancia es: diametro * Pi = Longitud
        // Fórmula del area de una circuferancia es: Pi * radio^2 = Area
        // Pi es aproximadamente 3.14

        Scanner lector = new Scanner(System.in);

        double valorRadio2;
        double valorDiametro;

        System.out.println("Ingrese el valor del radio al caudrado  ");
        valorRadio2 = lector.nextDouble();
        System.out.println("Ingrese el valor del diametro ");
        valorDiametro = lector.nextDouble();

        double resultArea = area(valorRadio2, 3.14);
        System.out.println("El area = " + resultArea);
        double resultDiametro = longitud(valorDiametro, 3.14);
        System.out.println("El diametro = " + resultDiametro);
        lector.close();
    }

    public static double area(double radio, double pi) {
        return radio * pi;
    }

    public static double longitud(double d, double pi) {
        return d * pi;

    }

}
