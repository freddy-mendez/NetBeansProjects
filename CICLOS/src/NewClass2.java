
import java.util.Scanner;


public class NewClass2 {
    public static void main(String args[]){
Scanner leer = new Scanner(System.in);
        int n = 20, num1 = 1, num2 = 20;
        String salir = null;
        System.out.println("Los números comprendidos entre 1 y 1000 son los siguientes: ");
        do {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + ", ");
            }
            num1 += n;
            num2 += n;
            System.out.println("");
            if (num2 == 1020) {
                System.out.println("Fin de la secuencia");
            } else {
                System.out.println("Quiere seguir imprimiendo la secuencia de los números? [Si - No]");
                salir = leer.next();
            }
        } while (salir.equals("Si") && num2 != 1020);
        System.out.println("Gracias.");
        }
}
