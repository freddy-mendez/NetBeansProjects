
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto cuesta el estereo");
        int precio = leer.nextInt();
        System.out.println("De que marca es?");
        String marca = leer.next();
        float descuento = 0;
        float iva=0.08F;
        if (precio>=20000) {
            descuento+=0.1F;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento+=0.05F;
        }
        float valorPagar = (precio-(precio*descuento))*(1+iva);
        //float valorPagar = (precio-(precio*descuento))+((precio-(precio*descuento))*iva);
        System.out.println("El valor a pagar es de "+valorPagar);
    }
    
}
