import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=5;
        int [] arreglo = new int[n];
        boolean [] aciertos = new boolean[n];
        int numerosGenerados = 0;
        int indice=0;
        do {
            int numero = (int) ((Math.random()*5)+1);
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
                System.out.print(((aciertos[i])?""+arreglo[i]:"X"));
            } else {
                System.out.print(","+((aciertos[i])?""+arreglo[i]:"X"));
            }
            
        }
        System.out.println("]");
        int numIntentos=0;
        int numMaxIntentos=10;
        int acierto=0;
        for (int i=0; i<numMaxIntentos; i++) {
            numIntentos++;
            System.out.println("Digite un numero entre 1 y "+n);
            int num = leer.nextInt();
            int existe=0;
            for (int j=0; j<indice; j++ ) {
                if (arreglo[j]==num) {
                    acierto++;
                    aciertos[j]=true;
                    System.out.println("OK, vamos por el siguente ");
                    existe=1;
                    System.out.println("");
                    System.out.print("arreglo = [");
                    for (int k = 0; k < n; k++) {
                        if (k == 0) {
                            System.out.print(((aciertos[k]) ? "" + arreglo[k] : "X"));
                        } else {
                            System.out.print("," + ((aciertos[k]) ? "" + arreglo[k] : "X"));
                        }

                    }
                    System.out.println("]");
                }
                if (acierto==arreglo.length) {
                    System.out.println("Felicitaciones, adivinaste todos los numero en "+
                            numIntentos+" intentos");
                    break;
                }
            }
            if (existe==0) {
                System.out.println("Sigue intendando!! ");
            }
            if (acierto==arreglo.length) {
                break;
            }
        }
    }
    
}
