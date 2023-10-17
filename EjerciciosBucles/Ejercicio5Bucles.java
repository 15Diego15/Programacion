public class Ejercicio5Bucles {
    public static void main(String[] args) {
        int totalPar = 0, totalImpar = 0, totalX5 = 0;
        int sumaPar = 0, sumaImpar = 0, sumaX5 = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " -> ");

            if (i % 5 == 0) {
                System.out.print(" MÚLTIPLO DE 5,");
                totalX5++;
                sumaX5 = sumaX5 + i;

            }
            if (i % 2 == 0) {
                System.out.println(" PAR.");
                totalPar++;
                sumaPar = sumaPar + i;
            } else {
                System.out.println(" IMPAR.");
                totalImpar++;
                sumaImpar = sumaImpar + i;
            }
        }
        System.out.print("El total de números múltiplos de 5 es: " + totalX5);
        System.out.println(" y su suma es: " + sumaX5);
        System.out.print("El total de números pares: " + totalPar);
        System.out.println(" y su suma es: " + sumaPar);
        System.out.print("El total de números impares: " + totalImpar);
        System.out.println(" y su suma es: " + sumaImpar);
    }
}
