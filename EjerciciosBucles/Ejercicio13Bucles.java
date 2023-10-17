public class Ejercicio13Bucles {
    static public final int MONEDA_CARA = 0;
    static public final int MONEDA_CRUZ = 1;

    public static void main(String[] args) {

        double cara = 0;
        double cruz = 0;
        double porcent = 1000000;
        for (int i = 1; i < 1000000; i++) {

            int monedaLanzada = (int) (Math.random() * 2);

            if (MONEDA_CARA == monedaLanzada) {
                cara++;
            } else {
                cruz++;
            }

        }
        cara = (cara * 100) / porcent;
        cruz = (cruz * 100) / porcent;
        System.out.println("Porcentaje de caras: " + cara + "%");
        System.out.println("Porcentaje de cruces: " + cruz + "%");
    }
}
