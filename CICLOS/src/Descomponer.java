
import java.util.Scanner;

public class Descomponer {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, siono,n1;
        System.out.println("\t Buenos Dias");
        System.out.println("Digite un número para comprobarlo");
        n = leer.nextInt();
    while (n>1) {
        siono = n % 2;
        n--;
        if (siono == 0) {
            n=n/2;
            
        } else {

        }
        System.out.println("Gracias por waching");
    }
    }
}
