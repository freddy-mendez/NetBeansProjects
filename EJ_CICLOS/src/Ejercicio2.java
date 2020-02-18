
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {       
        Scanner leer = new Scanner(System.in);
        int km, total, iva;
        System.out.println("Digite los km recorridos por el vehiculo");
        km = leer.nextInt();
        if (km <= 300) {
            total = 300000;
            iva = (int) (total * 0.20);         
            System.out.println("El monto a pagar es: " + total + " el iva es de: " + iva);
        } else {
            if (km > 300 && km <= 1000) {
                total = 300000 + (km - 300) * 15000;
            } else {
                total = 300000 + (700) * 15000;
                total = total + (km - 1000) * 10000;
            }
            iva = (int) (total * 0.20);
            System.out.println("El monto a pagar es: " + total + " el iva es de: " + iva);
        }
    }
}

