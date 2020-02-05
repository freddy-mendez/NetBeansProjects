import java.util.Scanner;


public class lunes3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n, contador=0;
        
        do {
            System.out.print("Introduce un número entero: ");
        n = leer.nextInt();
        if (n%10==2){
            contador++;
        }
        }while(n!=0);
        
       System.out.print("Se han introducido "+contador+" números acabados en 2: ");
  
    }
    
}