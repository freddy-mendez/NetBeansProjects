
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Digite un numero X dividendo");
        x=leer.nextInt();
        System.out.println("Digite un numero Y divisor");
        y=leer.nextInt();
        if (y!=0) {
            System.out.println("el cociente es:"+(x/y));
        } else {
            System.out.println("la división no es posible");
        }
    }
    
}
