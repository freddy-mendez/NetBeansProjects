
import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, siono;
        System.out.println("\t Buenos Dias");
        System.out.println("\t vamos a ver si es divisible por 5");
        System.out.println("Digite un número para comprobarlo");
        n = leer.nextInt();
        siono = n % 15;
        if (siono == 0) {
            System.out.println("Es multiplo de 5");
        } else {
            System.out.println("Pailas");
        }
        System.out.println("Gracias por waching");
    }
}
