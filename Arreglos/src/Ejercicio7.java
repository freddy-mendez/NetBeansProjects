
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num=0;
        System.out.println("Digite la altura");
        num = leer.nextInt();
        int array[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
            }      
        }
       for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(array[i][j]+" ");
            }  
            System.out.println();
        }
    }
}
