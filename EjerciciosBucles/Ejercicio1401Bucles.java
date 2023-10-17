public class Ejercicio1401Bucles {
    static public final int CARA_UNO = 0;
    static public final int CARA_DOS = 1;
    static public final int CARA_TRES = 2;
    static public final int CARA_CUATRO = 3;
    static public final int CARA_CINCO = 4;
    static public final int CARA_SEIS = 5;
    static public final double NUM_VECES = 1000000;

    public static void main(String[] args) {
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;

        for (int i = 0; i < NUM_VECES; i++) {
            int dadoLanzado = (int) (Math.random() * 6);

            switch (dadoLanzado) {
                case CARA_UNO:
                    cara1++;
                    break;
                case CARA_DOS:
                    cara2++;
                    break;
                case CARA_TRES:
                    cara3++;
                    break;
                case CARA_CUATRO:
                    cara4++;
                    break;
                case CARA_CINCO:
                    cara5++;
                    break;
                case CARA_SEIS:
                    cara6++;
                    break;
            }

        }

        double porcentCara2 = (cara2 * 100 / NUM_VECES);
        double porcentCara1 = (cara1 * 100 / NUM_VECES);
        double porcentCara3 = (cara3 * 100 / NUM_VECES);
        double porcentCara4 = (cara4 * 100 / NUM_VECES);
        double porcentCara5 = (cara5 * 100 / NUM_VECES);
        double porcentCara6 = (cara6 * 100 / NUM_VECES);
        System.out.println("La cara 1 ha aparecido un total de: " + cara1 + " y su porcentaje es del total es: "
                + porcentCara1 + "%");
        System.out.println("La cara 2 ha aparecido un total de: " + cara2 + " y su porcentaje es del total es: "
                + porcentCara2 + "%");
        System.out.println("La cara 3 ha aparecido un total de: " + cara3 + " y su porcentaje es del total es: "
                + porcentCara3 + "%");
        System.out.println("La cara 4 ha aparecido un total de: " + cara4 + " y su porcentaje es del total es: "
                + porcentCara4 + "%");
        System.out.println("La cara 5 ha aparecido un total de: " + cara5 + " y su porcentaje es del total es: "
                + porcentCara5 + "%");
        System.out.println("La cara 6 ha aparecido un total de: " + cara6 + " y su porcentaje es del total es: "
                + porcentCara6 + "%");
    }
}
