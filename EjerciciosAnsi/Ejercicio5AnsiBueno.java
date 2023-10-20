//primera parte del 5
public class Ejercicio5AnsiBueno {
    public static void main(String[] args) {
        String fila = "";

        for (int i = 1; i <= 9; i++) {
            fila += i;

            System.out.printf("\u001B[1;" + (28 + i) + ";50m %9s \u001B[0m\n", fila);

        }
    }
}
