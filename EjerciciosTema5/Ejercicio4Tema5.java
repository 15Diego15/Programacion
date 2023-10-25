public class Ejercicio4Tema5 {
    public static void main(String[] args) {
        int numMayor = max(9, 7, 5, 9);
        System.out.println("El número mayor es: " + numMayor);
    }

    public static int max(int num1, int num2, int num3, int num4) {
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            return num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            return num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            return num3;
        } else {
            return num4;
        }
    }
}