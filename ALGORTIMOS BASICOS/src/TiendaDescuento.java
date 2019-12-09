
import java.util.Scanner;

public class TiendaDescuento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el monto total de la compra :");
        float compra = leer.nextFloat();
        compra-=(compra*0.15F);
        //float valorPagar = compra-(compra*0.15F);
        System.out.println("querido cliente con el 15 % de descuento su "
                + "compra queda con el valor de :"+compra);
    }
    
}
