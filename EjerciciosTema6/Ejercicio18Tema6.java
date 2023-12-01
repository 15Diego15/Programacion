public class Ejercicio18Tema6 {
    public static void main(String[] args) {
        
        int[] arrayUno = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayDos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("El resultado es: " + sumaArray(arrayUno, arrayDos));
        System.out.println("El resultado es: " + divisionArray(arrayUno, arrayDos));
    }

    public static int sumaArray(int[] num1, int[] num2) {
        int contador = 0;
        for(int i = 0; i < num1.length; i++){
            contador = num1[i] + num2[i];
        }
        return contador;
        
    }

    public static int divisionArray(int[] num1, int[] num2) {
        int contador = 0;
        for(int i = 0; i < num1.length; i++){
            contador = num1[i] / num2[i];
        }
        return contador;
        
    }

    
}
