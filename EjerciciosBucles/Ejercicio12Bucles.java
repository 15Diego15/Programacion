import java.util.Scanner;

public class Ejercicio12Bucles {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numAdivinar = (int) (Math.random() * 100);
        int numIntentos = 0;
        int numero = 0;
        boolean acertado = false;

        System.out.println("Introduce el numero de intentos:");
        int intentos = lector.nextInt();
        System.out.println(numAdivinar);
        do {
            System.out.println("Escribe un número entre 1 y 100");
            numero = lector.nextInt();
            numIntentos++;
            if (numAdivinar == numero) {
                acertado = true;
            }

            if (acertado == false) {
                if (numAdivinar > numero) {
                    System.out.println("El número buscado es mayor");
                } else {
                    System.out.println("El número buscado es menor");
                }
            }
        } while (numIntentos < intentos && numAdivinar != numero);

        if (acertado) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Perdiste, el numero era: " + numAdivinar);
        }

        lector.close();
    }
}