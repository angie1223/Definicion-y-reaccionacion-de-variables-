import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("");

        System.out.print("hola buenas tardes usuarios esta aplicacion tomara su numero el que quiera y le dira si es par o no es pa por favor  ingrese su numero ");

        int n = leer.nextInt();

        if (n % 2 ==0 ) {

            System.out.printf("si el numero %d es PAR\n" , n);
        } else {


            System.out.printf("si el numero %d es IMPAR\n" , n);


        }
    }


}