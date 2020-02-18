
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = leer.nextInt();
        System.out.print("mes: ");
        mes = leer.nextInt();
        System.out.print("año: ");
        año = leer.nextInt();
        suma = dia + mes + año;
        cifra1 = suma/1000;   
        cifra2 = suma/100%10;  
        cifra3 = suma/10%10; 
        cifra4 = suma%10;   
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);
    }
}

