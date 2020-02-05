
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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int numero,promedio;
        System.out.println("Ingrese la cantidad de numero que desea: ");
        numero=leer.nextInt();
        if (numero>10){
            System.out.println("El numero es mayor de 10");
            
           
    } else  {
            int suma=0,n=0;
            while(numero>0) {
                System.out.println("Ingrese un numero : "+numero);
                n=leer.nextInt();
                numero--;
                suma=suma+n;
            }
            System.out.println("Ingrese un numero : "+suma);
        }
        
        System.out.println();
        
    }
    
}
