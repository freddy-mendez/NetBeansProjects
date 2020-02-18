
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
public class Promedio4Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4, promedio, suma=0;
        float menor=99999;
        Scanner leer = new Scanner(System.in);
        //for (int i=1; i<=4; i++){
            //System.out.println("Digite nota paractica "+(i));
            System.out.println("Digite nota paractica ");
            nota1= leer.nextFloat();
            System.out.println("Digite nota paractica ");
            nota2= leer.nextFloat();
            System.out.println("Digite nota paractica ");
            nota3= leer.nextFloat();
            System.out.println("Digite nota paractica ");
            nota4= leer.nextFloat();
            if (nota1<=nota2 && nota1<=nota3 && nota1<=nota4) {
                menor=nota1;
            } else {
                if (nota2<=nota1 && nota2<=nota3 && nota2<=nota4) {
                    menor=nota2;
                } else if(nota3<=nota1 && nota3<=nota2 && nota3<=nota4) {
                    menor=nota3;
                } else if (nota4<=nota1 && nota4<=nota2 && nota4<=nota3) {
                    menor = nota4;
                }
            }
            suma=nota1+nota2+nota3+nota4-menor;
            promedio=suma/3;
            
//            if (nota<menor){
//                menor=nota;
//            }
//            suma=suma+nota;
        //}
        //promedio=(suma-menor)/3;
        System.out.println("La nota menor es: "+menor);
        System.out.println("promedio practicas: "+promedio);
    }
    
}
