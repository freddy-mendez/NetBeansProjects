package evaluacion_conocimiento;

import java.util.Scanner;

public class PromedioNotas {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        float mayor=0, menor=0, calif=0.0F, acumulador=0.0F;
        System.out.println("Digite el número de N de calificaciones:");
        n=leer.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println("Digite el valor de la calificación "+i);
            calif=leer.nextFloat();
            acumulador+=calif;
            if (i==1) {
                mayor=menor=calif;
            } else {
                if (calif>mayor) {
                    mayor=calif;
                }
                if (calif<menor) {
                    menor=calif;
                }
            }
        }
        System.out.printf("Promedio: %.2f Mayor: %.2f "
                + "Menor: %.2f", (acumulador/n),mayor, menor );
    }
}
