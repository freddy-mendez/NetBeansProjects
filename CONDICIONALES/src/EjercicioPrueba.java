
import java.util.Scanner;

public class EjercicioPrueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        int valor=0;
        System.out.println("Digite un numero");
        n=leer.nextInt();
        if ((n%2==0) || (valor+=5)<n) {
            System.out.println("Paso por el if");
        } else {
            System.out.println("Paso por el else");
        }
        System.out.println(""+valor);
    }
    
}
