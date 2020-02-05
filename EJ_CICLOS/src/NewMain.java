/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teleinformatica III
 */
import java.util.Scanner;

public class NewMain {
/*
Guillermo tiene N dorares. Luis tiene la mitad de lo que posee Guillermo. 
Juan tiene la mitad de lo que posee Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */



    public static void main(String[] args) {
   
   Scanner leer=new Scanner(System.in);
   int numero=0, contador=0;
   do {
        System.out.println("Escriba un numero de 5 sifras");
   numero = leer.nextInt();
   } while (numero <=9999 || numero >=100000); 
   int numero1=numero;
   while (numero1>0){
       numero1=numero1/10;
       contador++;
   }
        System.out.println("El numero "+numero +" tiene "+contador + " digitos");
    } 
        
}

    
    

