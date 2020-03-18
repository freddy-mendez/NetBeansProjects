import java.util.Scanner;
public class SueldoBase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el valor de las ventas");
        float venta1 = leer.nextFloat();
        float venta2 = leer.nextFloat();
        float venta3 = leer.nextFloat();
        System.out.println("Escriba el valor del sueldo base");
        float sueldo = leer.nextFloat();
        float comision = (venta1+venta2+venta3)*0.1F;
        System.out.println("El sueldo del mes es:"+(sueldo+comision));
    }
   }
