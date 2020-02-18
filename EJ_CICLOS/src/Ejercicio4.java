
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int descu = 0, costo = 0, cantidad = 0, regalo=0, total_1=0, total_2=0;

        do {
            System.out.println("Digite el valor de la docena");
            costo = leer.nextInt();
            System.out.println("Digite la cantidad de docenas");
            cantidad = leer.nextInt();
        } while (costo < 0 || cantidad < 0);
        {
            if (cantidad>3){
                descu = (costo*cantidad)*15/100;
                regalo = (cantidad-3);
            }else{
                descu = (costo*cantidad)*10/100;
            }
            total_1 = (costo*cantidad);
            total_2 = (total_1-descu);
            System.out.println("El total de la compra es: $"+total_1+"\n"+
                    "El descuento es: $"+descu+"\n"+
                    "El total a pagar es: $"+total_2+"\n"+
                    "La cantidad de regalos es: "+regalo+"\n"+
                    "");
        }
    }
}
