
import java.util.Scanner;

public class ParesImpares {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite un numero entero");
        n=leer.nextInt();
        if (n%2==0) {
            System.out.println("El numero "+n+" es Par");
        } else {
            System.out.println("El numero "+n+" es Impar");
        }
    }
    
}
