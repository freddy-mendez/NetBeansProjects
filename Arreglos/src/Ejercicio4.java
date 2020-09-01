import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=5;
        int [] arreglo = new int[n];
        int numerosGenerados = 0;
        int indice=0;
        do {
            int numero = (int) ((Math.random()*20)+1);
            int existe=0;
            for (int i=0; i<indice; i++) {
                if (arreglo[i]==numero) {
                    existe=1;
                }
            }
            if (existe==0) {
                arreglo[indice]=numero;
                indice++;
                numerosGenerados++;
            }
        } while(numerosGenerados<n);
        System.out.println("");
        System.out.print("arreglo = [");
        for (int i=0; i<n; i++) {
            if (i==0) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(","+arreglo[i]);
            }
            
        }
        System.out.println("]");
        int numIntentos=0;
        int numMaxIntentos=10;
        int aciertos=0;
        for (int i=0; i<numMaxIntentos; i++) {
            numIntentos++;
            System.out.println("Digite un numero entre 1 y 20");
            int num = leer.nextInt();
            int existe=0;
            for (int j=0; j<indice; j++ ) {
                if (arreglo[j]==num) {
                    aciertos++;
                    System.out.println("OK, vamos por el siguente ");
                    for (int k=j+1; k<indice; k++) {
                        arreglo[k-1]=arreglo[k];
                    }
                    indice--;
                    existe=1;
                }
                if (aciertos==arreglo.length) {
                    System.out.println("Felicitaciones, adivinaste todos los numero en "+
                            numIntentos+" intentos");
                    break;
                }
            }
            if (existe==0) {
                System.out.println("Sigue intendando!! ");
            }
            if (aciertos==arreglo.length) {
                break;
            }
        }
    }
    
}
