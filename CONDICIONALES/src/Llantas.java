
import java.util.Scanner;

public class Llantas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de llantas a comprar");
        int llantas = leer.nextInt();
        long precio = 0;
        if (llantas<5) {
            precio=30000;
        } else if (llantas>=5 && llantas<=10) {
            precio=25000;
        } else {
            precio=20000;
        }
        System.out.println("Precio por llanta = "+precio);
        System.out.println("Total comprar llantas = "+precio*llantas);
    }
    
}
