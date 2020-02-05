import java.util.Scanner;

public class Pantalones {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final float precioTela = 10000;
        double manoObra=0, precioVenta=0, ganancia=0, telaModeloA=1.5, telaModeloB=1.8;
        
        System.out.println("Seleccione el modelo [A o B]");
        char modelo = leer.next().toUpperCase().charAt(0);
        System.out.println("Seleccione la talla 30, 32 o 36");
        int talla = leer.nextInt();
        System.out.println("Seleccione numero de pantalones");
        int numero = leer.nextInt();
        if (modelo=='A') {
            precioVenta=precioVenta+(precioTela*telaModeloA);
            manoObra = manoObra + ((precioTela*telaModeloA)*0.8);
            precioVenta=precioVenta+manoObra;
        } else if (modelo=='B') {
            precioVenta=precioVenta+(precioTela*telaModeloB);
            manoObra = manoObra + ((precioTela*telaModeloB)*0.95);
            precioVenta=precioVenta+manoObra;
        }
        
        if (talla==32 || talla==36) {
            precioVenta=precioVenta+(precioVenta*0.04);
        }
        
        ganancia=precioVenta*0.3;
        precioVenta=precioVenta+ganancia;
        
        System.out.println("El precio final de venta del pantalon es: "+precioVenta);
        System.out.println("Ganancia: "+(ganancia*numero));
        
        
        
    }
    
}
