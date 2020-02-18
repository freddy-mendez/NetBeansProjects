
import java.util.Scanner;


public class Ejemplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        p.setDocumento(leer.nextInt());
        p.setNombre(leer.next());
        System.out.println(p);
    }
    
}
