import java.util.Scanner;

public class Ejercicio1601Bucles {
    static public final int MAXIMO = 11;
    static public final int SEGUIR_JUGANDO = 1;

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int num1;
        int contadorJugador;
        int contadorMaquina;
        int porraJugador = 0;
        int porraMaquina = 0;
        do {
            int dadoLanzado = (int) (Math.random() * 6 + 1);
            System.out.println("Su número es: " + dadoLanzado);
            contadorJugador = dadoLanzado;
            contadorMaquina = 0;

            do {
                System.out.println("Ingrese <1> si quiere seguir jugando o cualquier otro número si quiere plantarse");
                num1 = lector.nextInt();

                if (num1 == SEGUIR_JUGANDO) {
                    dadoLanzado = (int) (Math.random() * 6 + 1);
                    System.out.println("Tu nuevo número es: " + dadoLanzado);
                    contadorJugador = contadorJugador + dadoLanzado;
                    System.out.println("Tu total es: " + contadorJugador);
                } else {
                    System.out
                            .println("Tu número final es: " + contadorJugador + ". Ahora es turno del otro jugador. ");
                }
            } while (num1 == SEGUIR_JUGANDO && contadorJugador < MAXIMO);

            if (contadorJugador == MAXIMO) {
                System.out.println("HAS GANADO!!");
                porraJugador = porraJugador + 2;
                System.out.println("Tu porra actual es: " + porraJugador);
            } else if (contadorJugador > MAXIMO) {
                System.out.println("HAS PERDIDO!!");
                porraMaquina = porraMaquina + 1;
                System.out.println("La porra actual de tu rival es: " + porraMaquina);
            } else {

                System.out.println("_____________________________________________________");
                dadoLanzado = (int) (Math.random() * 6 + 1);
                System.out.println("El primer número del rival es: " + dadoLanzado);
                contadorMaquina = contadorMaquina + dadoLanzado;
                while (contadorMaquina < MAXIMO || contadorMaquina == contadorJugador) {
                    dadoLanzado = (int) (Math.random() * 6 + 1);
                    System.out.println("El nuevo número del rival es: " + dadoLanzado);
                    contadorMaquina = contadorMaquina + dadoLanzado;
                    System.out.println("Su total es: " + contadorMaquina);
                }
                System.out.println("El número final del rival es: " + contadorMaquina);

                if (contadorJugador > contadorMaquina) {
                    System.out.println("HAS GANADO!!");
                    porraJugador = porraJugador + 1;
                    System.out.println("Tu porra actual es: " + porraJugador);
                } else if (contadorJugador < contadorMaquina && contadorMaquina < MAXIMO) {
                    System.out.println("HAS PERDIDO.");
                    porraMaquina = porraMaquina + 1;
                    System.out.println("La porra actual de tu rival es: " + porraMaquina);
                } else if (contadorMaquina == MAXIMO) {
                    System.out.println("HAS PERDIDO.");
                    porraMaquina = porraMaquina + 2;
                    System.out.println("La porra actual de tu rival es: " + porraMaquina);
                } else if (contadorJugador == contadorMaquina) {
                    System.out.println("EMPATE");
                    porraMaquina = porraMaquina + 1;
                    System.out.println("La porra actual de tu rival es: " + porraMaquina);
                } else {
                    System.out.println("HAS GANADO!!");
                    porraJugador = porraJugador + 1;
                    System.out.println("Tu porra actual es: " + porraJugador);
                }

            }
            
            System.out.println("__________________NUEVA RONDA______________");
            System.out.println("El marcador actual es:");
            System.out.println("Tuyo: " + porraJugador + "       Rival: " + porraMaquina);
        } while (porraJugador < 5 && porraMaquina < 5);
        lector.close();
        if (porraJugador == 5) {
            System.out.println("Has ganado la partida");
        } else if (porraMaquina == 5) {
            System.out.println("Has perdido la partida");
        }
    }
}