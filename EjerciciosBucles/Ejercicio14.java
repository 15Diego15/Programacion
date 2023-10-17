public class Ejercicio14 {
    public static void main(String[] args) {
        int caraUno = 0;
        int caraDos = 1;
        int caraTres = 2;
        int caraCuatro = 3;
        int caraCinco = 4;
        int caraSeis = 5;
        double cara1 = 0;
        double cara2 = 0;
        double cara3 = 0;
        double cara4 = 0;
        double cara5 = 0;
        double cara6 = 0;
        double porcentCara1 = 0;
        double porcentCara2 = 0;
        double porcentCara3 = 0;
        double porcentCara4 = 0;
        double porcentCara5 = 0;
        double porcentCara6 = 0;
        double porcent = 1000000;
        for (int i = 0; i < 1000000; i++) {

            int dadoLanzado = (int) (Math.random() * 6);
            if (caraUno == dadoLanzado) {
                cara1++;
            } else if (caraDos == dadoLanzado) {
                cara2++;
            } else if (caraTres == dadoLanzado) {
                cara3++;
            } else if (caraCuatro == dadoLanzado) {
                cara4++;
            } else if (caraCinco == dadoLanzado) {
                cara5++;
            } else if (caraSeis == dadoLanzado) {
                cara6++;
            }

        }
        porcentCara1 = (cara1 * 100 / porcent);
        porcentCara2 = (cara2 * 100 / porcent);
        porcentCara3 = (cara3 * 100 / porcent);
        porcentCara4 = (cara4 * 100 / porcent);
        porcentCara5 = (cara5 * 100 / porcent);
        porcentCara6 = (cara6 * 100 / porcent);
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
