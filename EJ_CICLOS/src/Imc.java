
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
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float peso=0,altura=0,imc=0;
        System.out.println("Ingrese su peso");
        peso=leer.nextFloat();
        System.out.println("Ingrese su altura");
        altura=leer.nextFloat();
        imc=(float) (peso/(Math.pow(altura, 2)));
        if(imc<16){
            System.out.println("Criterio de ingreso en hospital");
        }
        else if(imc>=16&&imc<17){
            System.out.println("Infrapeso");
        }
        else if(imc>=17&&imc<18){
            System.out.println("Bajo peso");
        }
        else if(imc>=18&&imc<25){
            System.out.println("Peso normal");
        }
        else if(imc>=25&&imc<30){
            System.out.println("Sobrepeso");
        }
        else if(imc>=30&&imc<35){
            System.out.println("Sobrepeso crónico");
        }
        else if(imc>=35&&imc<40){
            System.out.println("Obesidad premórbida");
        }
        else if(imc>=40){
            System.out.println("Obesidad mórbida");
        }
    }
    
}
