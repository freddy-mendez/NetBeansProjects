
import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite un numero entero");
        n = leer.nextInt();
        int n1 = n;
        int divisor;
        System.out.print("Divisores de " + n + " ");
        /*for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0) {
                int div=0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        div++;
                    }
                }
                if (div == 1) {
                    System.out.print(" " + i);
                } 
            }
        }*/
        while(n1>1) {
            divisor=2;
            while(n1%divisor!=0) {
                divisor++;
            }
            n1=n1/divisor;
            System.out.print(" "+divisor);
        }
        System.out.println(" ");
    }
}
