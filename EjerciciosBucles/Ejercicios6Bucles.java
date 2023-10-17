import java.util.Scanner;


public class Ejercicios6Bucles {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int num;
        System.out.println("Escriba un número del 1 al 10");
        num = lector.nextInt();
       

        for( num = 0; num <=10; lector.nextLine()){
            if (num == 1) {
                System.out.println("1,2,3,4,5,6,7,8,9,10");
                     
            }
            lector.close();
        }



    }
}
    

