
import java.util.Scanner;









public class Texto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tiempo de ejercicio: [HH:mm:ss]");
        String tiempo = leer.next();
        System.out.println(" Tiempo: "+tiempo);
        String [] datos = tiempo.split(":");
        System.out.println("Hora:"+datos[0]);
        System.out.println("Min:"+datos[1]);
        System.out.println("Seg:"+datos[2]);
    }
}
