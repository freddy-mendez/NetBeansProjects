
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Samuel {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String Nombre;
        ArrayList<String> ListaNombres = new ArrayList<String>();
        do {
            System.out.println("Introduzca un nombre: ");
            Nombre = leer.nextLine();
            ListaNombres.add(Nombre);
            System.out.println("¿Desea introducir otro nombre? s/n");
            Nombre = leer.nextLine();
        } while (!Nombre.equals("n") && !Nombre.equals("N"));
        Collections.sort(ListaNombres);
        System.out.println("" + ListaNombres);
    }
}
