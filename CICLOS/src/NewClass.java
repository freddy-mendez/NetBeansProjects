
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teleinformatica III
 */
public class NewClass {
  public static void main(String[] args) {
           {
        Scanner Leer= new Scanner(System.in);
        int N=0, M=0;
        do{
        System.out.println("Si numero 1 es mayor a numero 2 digite nuevamente");
        System.out.println("Digite numero 1");
        N=Leer.nextInt();
        System.out.println("Digite numero 2");
        M=Leer.nextInt();
        }while(N>M);
          System.out.println("Los numeros Impares entre Numero 1 y Numero 2 son: ");

        for(int i=N;i<=M;i++){

            if(i%2!=0){
                System.out.println(""+i);
                
            }
        }
            
    }
    
}  
}
