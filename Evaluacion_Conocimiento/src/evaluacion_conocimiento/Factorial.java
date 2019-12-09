package evaluacion_conocimiento;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0, acumulador=1;
        System.out.println("Digite el numero N");
        n=leer.nextInt();
        for (int i=1; i<=n; i++) {
            acumulador*=i;
        }
        System.out.printf("El factorial de %f es %f", n,acumulador );
    }    
}
