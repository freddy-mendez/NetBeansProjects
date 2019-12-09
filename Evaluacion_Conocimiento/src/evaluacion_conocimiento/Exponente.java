package evaluacion_conocimiento;

import java.util.Scanner;

public class Exponente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int base=0, exponente=0, acumulador=1;
        System.out.println("Digite la base");
        base=leer.nextInt();
        System.out.println("Digite el exponente");
        exponente=leer.nextInt();
        for (int i=0; i<exponente; i++) {
            acumulador*=base;
        }
        System.out.printf(" %d ^ %d = %d ", base,exponente, acumulador );
        
    }    
}
