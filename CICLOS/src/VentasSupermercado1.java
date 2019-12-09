
import java.util.Scanner;

public class VentasSupermercado1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 5;
        long sumaVentas=0;
        long venta=0;
        for (int i=0; i<n; i++) {
            venta=0;
            int precio=0;
            System.out.println("Digite el numero de articulos para cliente "+(i+1));
            int numero = leer.nextInt();
            for (int j=0; j<numero; j++) {
                System.out.println("Digite el precio del articulo "+(j+1));
                precio=leer.nextInt();
                venta+=precio;
            }
            System.out.println("El cliente debe pagar:"+venta);
            sumaVentas+=venta;
        }
        System.out.println("Los clientes pagaron :"+sumaVentas);
    }
}
