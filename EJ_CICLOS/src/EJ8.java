import java.util.Scanner;
public class EJ8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m=0, n=0;
        do {
            System.out.println("El valor de M debe ser menor que el valor de N");
            System.out.println("Digite el numero M");
            m=leer.nextInt();
            System.out.println("Digite el numero N");
            n=leer.nextInt();
        } while(m>n);
        for (int i=m; i<=n; i++) {
            if (i%2!=0) {
                System.out.print(i+", ");
            }
        }
    }    
}
