
import java.util.Scanner;

public class VentasSupermercado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 5;
        long sumaVentas=0;
        long venta=0;
        for (int i=0; i<n; i++) {
            venta=0;
            int precio=0;
            while(precio!=-1) {
                System.out.println("Digite el precio del articulo. \n"
                        + "Digite -1 para teminar");
                precio=leer.nextInt();
                if (precio!=-1) {
                    venta+=precio;
                }
            }
            System.out.println("El cliente debe pagar:"+venta);
            sumaVentas+=venta;
        }
        System.out.println("Los clientes pagaron :"+sumaVentas);
    }
}
