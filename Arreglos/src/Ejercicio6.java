
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=5;
        int array1[] = new int[num];
        int array2[] = new int[num];
        int array3[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.println("Digite 5 numeros enteros "+(i+1));
            array1[i]= leer.nextInt();
        }
        for(int i=0; i<num; i++){
            System.out.println("Digite 5 numeros enteros "+(i+1));
            array2[i]= leer.nextInt();
        }
        imprimir(array1);
        imprimir(array2);
        for(int i=0, j=num-1; i<num; i++, j--){
            array3[i] = array1[i]*array2[i];
        }
        for(int i=0; i<num; i++){
           System.out.print(array3[i]+", "); 
        }
        
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
