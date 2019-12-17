
import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, div=0;
        System.out.println("Digite un numero entero");
        n = leer.nextInt();
        if (n>1) {
            for (int i=2; i<=n; i++) {
                if (n%i==0) {
                    div++;
                }
            }
            if (div==1) {
                System.out.println("Es Primo");
            } else {
                System.out.println("NO Es Primo");
            }
        } else {
            System.out.println("El numero debe ser mayor de 1");
        }
    }
}
