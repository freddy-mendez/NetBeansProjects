
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite un numero de 3 cifras:");
        String numero = leer.next();
        if (numero.length()==3) {
            StringBuilder numeroReverso = new StringBuilder(numero);
            if (numero.equals(numeroReverso.reverse().toString())) {
                System.out.println("el numero  es igual al inverso:"); 
            } else {
                System.out.println("el numero no es igual al inverso:");
            }
        } else {
            System.out.println(" debe ingresar un numero de tres cifras");
        }
        /*int num, unidad, centena = 0;
        String tiponumero = "";
        System.out.println("digite un numero de 3 cifras:");
        num = leer.nextInt();
        if (num > 99 && num < 1000) {
            unidad = num % 10;
            centena = (num / 100);
            if (unidad == centena) 
                System.out.println("el numero  es igual al inverso:"); 
            
            else 
                System.out.println("el numero no es igual al inverso:"); 
        }
              else  {
 System.out.println(" debe ingresar un numero de tres cifras");
                    }*/
    }
}
