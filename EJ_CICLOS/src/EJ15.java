
import java.util.Scanner;

public class EJ15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una hora, con minutos y segundos");
        int h = 0;
        do {
            System.out.println("Digite la hora");
            h = leer.nextInt();
        } while (h < 0 || h > 23);
        int m = 0;
        do {
            System.out.println("Digite los minutos");
            m = leer.nextInt();
        } while (m < 0 || m > 59);
        int s = 0;
        do {
        System.out.println("Digite los segundos");
        s = leer.nextInt();
        } while (s < 0 || s > 59);
        s++;
        if (s>59) {
            m++;
            s=0;
        }
        if (m>59) {
            h++;
            m=0;
        }
        if (h>23) {
            System.out.println("Nuevo dia");
            h=0;
        }
        System.out.println("Hora= "+h+":"+m+":"+s);
    }
}
