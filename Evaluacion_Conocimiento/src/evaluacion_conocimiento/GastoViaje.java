package evaluacion_conocimiento;

import java.util.Scanner;

public class GastoViaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int km, precioComb = 0, precioPeaj = 0;
        System.out.println("Digite el numero de Kilometros de IDA");
        km = leer.nextInt();
        System.out.println("Digite el precio del litro de combustible");
        precioComb = leer.nextInt();
        System.out.println("Digite el precio del Peaje");
        precioPeaj = leer.nextInt();
        int kmTotales = km * 2;
        float precioTotalComb = (kmTotales / (float)13) * precioComb;
        float precioTotalPeaj = precioPeaj * 4;
        float subTotal = precioTotalComb + precioTotalPeaj;
        if (kmTotales > 400) {
            subTotal += 50;
        }
        System.out.println("El costo total del viaje es: "+ subTotal); 
	
    }
}
