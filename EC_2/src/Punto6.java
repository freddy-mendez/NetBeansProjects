
import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        int numero = (int) (Math.random()*900)+100;
        int intentos=10;
        //System.out.println("Numero:"+numero);
        while(intentos>0) {
            System.out.println("Digite un numero entero [100, 999]");
            n = leer.nextInt();
            if (n>numero) {
                System.out.println(n+" es mayor que X");
            } else if (n<numero) {
                System.out.println(n+" es menor que X");
            } else if (n==numero) {
                System.out.println(n+" es igual que X");
                break;
            }
            intentos--;
        }
        intentos--;
        if (intentos>=0) {
            System.out.println(" Muy bien encontro el numero en "+(10-intentos)+" intentos");
        } else {
            System.out.println(" Se acabaron los intentos, prueba mas tarde nuevamente");
        }
        System.out.println("Numero:"+numero);
    }    
}
