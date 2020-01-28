
import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero n de personas ");
        int n = leer.nextInt();
        int altura=0, suma=0;
        for (int i=0; i<n; i++) {
            System.out.println("Digite la altura de la persona "+(i+1)+" en cm");
            altura=leer.nextInt();
            suma=suma+altura;
        }
        System.out.println("El promedio de altura en cm de las "+(n)+" personas es "+(suma/(n*1.0)));
    }
}
