public class Ejercicio7Ansi {
    public static void main(String[] args) {
        String fila = "";

        for (int i = 1; i <= 9; i++) {
            fila += i;
            for (int j = 1; j <= i; j++) {

                System.out.printf("%18s\n", fila + j);
            }

        }
    }
}
