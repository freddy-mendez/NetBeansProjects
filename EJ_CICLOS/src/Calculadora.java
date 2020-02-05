
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion=0,numero_1=0,numero_2=0, suma=0,resta=0,multiplicacion=0,division=0;
        do{
        System.out.println("Seleccione una opción para realizar una operación");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        opcion=leer.nextInt();
        }
        while(opcion<1||opcion>4);
        if(opcion==1){
            System.out.println("Ingrese 2 números.");
            numero_1=leer.nextInt();
            numero_2=leer.nextInt();
            suma=numero_1+numero_2;
            System.out.println("La suma de los 2 números es "+suma);
        }
        else if(opcion==2){
            System.out.println("Ingrese 2 números.");
            numero_1=leer.nextInt();
            numero_2=leer.nextInt();
            resta=numero_1-numero_2;
            System.out.println("La resta de los 2 números es "+resta);
        }
        else if(opcion==3){
            System.out.println("Ingrese 2 números.");
            numero_1=leer.nextInt();
            numero_2=leer.nextInt();
            multiplicacion=numero_1*numero_2;
            System.out.println("La multiplicacion de los 2 números es "+multiplicacion);
        }
        else if(opcion==4){
            System.out.println("Ingrese 2 números.");
            numero_1=leer.nextInt();
            numero_2=leer.nextInt();
            division=numero_1/numero_2;
            System.out.println("La division de los 2 números es "+division);
        }
    }
    
}
