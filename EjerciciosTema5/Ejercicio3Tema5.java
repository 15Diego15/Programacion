public class Ejercicio3Tema5 {
    public static void main(String[] args) {
        int numMayor = mayor(3, 8);
        System.out.println("El número mayor es: " + numMayor);
    }

    public static int mayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}