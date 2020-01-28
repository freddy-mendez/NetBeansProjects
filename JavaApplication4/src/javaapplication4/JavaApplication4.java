/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Teleinformatica III
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, sumapar=0, sumaimpar=0;
        int contadorpar=0,contadorimpar=0, residuo=0;
        float mediapar; 
        float mediaimpar;
        
        for (i=1;i<=200;i++){  //arranca en 1;llega hasta 200; a 1 paso
             if (i%2==0) {     // si = i residuo entre 2 es igual a 0
            contadorpar++; //contador aumenta 
            sumapar=sumapar+i;   // se  suma sumapar mas i    
        }
            else { //sino 
                contadorimpar++; // aumenta impar 
                sumaimpar=sumaimpar+i; //se suma impar mas i
            }
        
    }
   mediapar=sumapar/contadorpar; //   se saca la media de pares
   mediaimpar=sumaimpar/contadorimpar; // se saca la media de  impares
   
   System.out.println("Suma de pares entre 1 y 200 " + sumapar);
   System.out.println("Media de pares "+contadorpar);
   System.out.println("Suma de impares entre 1 y 200 " + sumaimpar);
   System.out.println("Media de impares " +contadorimpar);
}
}
    }
    
}
