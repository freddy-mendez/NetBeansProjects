
import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 10;
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            int numero = (int) ((Math.random() * 15) + 1);
            arreglo[i] = numero;
        }
        
        imprimir(arreglo);
        
        for(int i=0; i<arreglo.length-1; i++) {
            for (int j=i+1; j<arreglo.length; j++) {
                if (arreglo[i]>arreglo[j]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        
        imprimir(arreglo);
        
    }
    
    
    private static void imprimir(int [] a) {
        System.out.println("");
        System.out.print("arreglo = [");
        for (int i=0; i<a.length; i++) {
            if (i==0) {
                System.out.print(a[i]);
            } else {
                System.out.print(","+a[i]);
            }
            
        }
        System.out.println("]");
    }
}
