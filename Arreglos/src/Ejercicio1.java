
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=5;
        int [] arreglo = new int[n];
        
        for (int i=0; i<n; i++) {
            System.out.println("Digite la edad de la persona "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        int suma=0;
        for (int i=0; i<n; i++) {
            suma = suma + arreglo[i];
        }
        double promedio = suma/(n*1.0);
        System.out.println(promedio);
        int contador=0;
        for (int i=0; i<n; i++) {
            if (arreglo[i]>promedio) {
                contador++;
            }
        }
        System.out.println("El numero de personas mayores al promedio de edad son "+contador);
        
        
    }
    
}
