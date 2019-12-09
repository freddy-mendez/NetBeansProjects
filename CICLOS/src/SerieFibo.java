
import java.util.Scanner;

public class SerieFibo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el n-esimo termino que"
                + " desea calcular");
        int n = leer.nextInt();
        int fibo1=0;
        int fibo2=1;
        if (n==1 || n==2) {
            System.out.println("El n-esimo termino "
                    + "es:"+((n==1)?fibo1:fibo2));
        } else {
            for (int i=3; i<=n; i++) {
                int temp = fibo1+fibo2;
                fibo1=fibo2;
                fibo2=temp;
            }
            System.out.println("El n-esimo "
                    + "termino es:"+fibo2);
        }
    }
    
}
