
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
        for(int i=0; i<num; i++){
            array3[i] = array1[i]*array2[i];
        }
        for(int i=0; i<num; i++){
           System.out.print(array3[i]+", "); 
        }
        
    }
}
