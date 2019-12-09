
import java.util.Scanner;


public class InvertirCapital {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        long capital = 0;
        int porcentaje = 0;
        System.out.println("Escriba el valor de  la inversión");
        capital=leer.nextLong();
        System.out.println("Escriba el valor del porcentaje 0-100");
        porcentaje=leer.nextInt();
        float ganancia = (capital*porcentaje)/100.0F;
        System.out.println("La ganancia es:"+ganancia);
    }
}
