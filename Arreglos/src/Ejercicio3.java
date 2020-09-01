
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=10;
        int [] arreglo = new int[n];
        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Digite un numero entero ["+(i+1)+"/"+arreglo.length+"]");
            arreglo[i]=leer.nextInt();
        }
        System.out.println("");
        System.out.print("arreglo = [");
        for (int i=0; i<n; i++) {
            System.out.print(arreglo[i]+",");
        }
        System.out.println("]");
        int posMayor=0;
        for (int i=0; i<arreglo.length; i++) {
            if (arreglo[i]>arreglo[posMayor]) {
                posMayor=i;
            }
        }
        System.out.println("El numero mayor es: "+arreglo[posMayor]);
        int posMenor=0;
        for (int i=0; i<arreglo.length; i++) {
            if (arreglo[i]<arreglo[posMenor]) {
                posMenor=i;
            }
        }
        System.out.println("El numero menor es: "+arreglo[posMenor]);
        int suma=0;
        for (int i=0; i<arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        int promedio = suma/arreglo.length;
        System.out.println(promedio);
        int contador=0;
        for (int i=0; i<arreglo.length; i++) {
            if (arreglo[i]==promedio) {
                contador++;
            }
        }
        System.out.println("La cantidad de numeros iguales al promedio es: "+contador);
        int index=arreglo.length;
        for (int i=0; i<arreglo.length-1; i++) {
            for (int j=i+1; j<index; j++) {
                if (arreglo[j]==arreglo[i]) {
                    for (int k=j+1; k<index; k++) {
                        arreglo[k-1]=arreglo[k];
                    }
                    index--;
                    j--;
                }
            }
        }
        System.out.println("");
        System.out.print("arreglo = [");
        for (int i=0; i<index; i++) {
            System.out.print(arreglo[i]+",");
        }
        System.out.println("]");
    }
    
}
