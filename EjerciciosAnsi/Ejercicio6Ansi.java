public class Ejercicio6Ansi {
    public static void main(String[] args) {
        String fila = "";

        for (int i = 1; i <= 9; i++) {
            fila += i;

            System.out.printf("%18s\n", fila + fila);

        }
    }
}
