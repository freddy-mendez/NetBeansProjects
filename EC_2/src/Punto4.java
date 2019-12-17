
import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        System.out.println("Digite un numero entero");
        n = leer.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Tabla del "+i);
            for (int j=1; j<=10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }    
}
