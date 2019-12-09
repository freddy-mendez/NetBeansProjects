
import java.util.Scanner;

public class UnoPositivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Digite un numero X");
        x=leer.nextInt();
        System.out.println("Digite un numero Y");
        y=leer.nextInt();
        if (x>0 || y>0) {
            System.out.println("X:"+x+" Y:"+y);
        }
    }
    
}
