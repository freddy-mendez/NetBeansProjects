
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Juan=0, Mario=0, Pedro=0;
        System.out.println("¿Cual es el año de nacimiento de Juan?");
        Juan = leer.nextInt();
        System.out.println("¿Cual es el año de nacimiento de Mario?");
        Mario = leer.nextInt();
        System.out.println("¿Cual es el año de nacimiento de Pedro?");
        Pedro = leer.nextInt();
        
        if ((Math.abs(Juan-Mario)<=3)) {
            System.out.println("Juan y Mario son contemporaneos");
        }
        if ((Math.abs(Juan-Pedro)<=3)) {
            System.out.println("Juan y Pedro son contemporaneos");
        }
        if ((Math.abs(Mario-Pedro)<=3)) {
            System.out.println("Mario y Pedro son contemporaneos");
        }
        /*if(Juan>Mario){
            if(Mario>Pedro){
            System.out.println("Juan es más contemporaneo que Mario y "
                    + "Mario es más contemporaneo que Pedro");
            }
            else if(Mario<Pedro){
                if(Juan>Pedro){
                    System.out.println("Juan es más contemporaneo que Pedro y "
                    + "Pedro es más contemporaneo que Mario");  
                }
                else if(Juan<Pedro){
                    System.out.println("Pedro es más contemporaneo que Juan y "
                    + "Juan es más contemporaneo que Mario"); 
                }
            }
        }
        if(Juan<Mario){
            if(Mario<Pedro){
            System.out.println("Pedro es más contemporaneo que Mario y "
                    + "Mario es más contemporaneo que Juan");
            }
            else if(Mario>Pedro){
                if(Juan>Pedro){
                    System.out.println("Mario es más contemporaneo que Juan y "
                    + "Juan es más contemporaneo que Pedro");  
                }
                else if(Juan<Pedro){
                    System.out.println("Mario es más contemporaneo que Pedro y "
                    + "Pedro es más contemporaneo que Juan"); 
                }
            }
        }*/
        
    }
    }
    
