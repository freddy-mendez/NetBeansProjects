
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char continuar=0;
        int inicio=1, fin=20, paso=20;
        do {
            for (int i=inicio; i<=fin; i++) {
                System.out.print(i+", ");
            }
            inicio=inicio+paso;
            fin=fin+paso;
            do{
            System.out.println("\nQuiere seguir imprimiendo [S/N]");
            continuar=leer.next().toUpperCase().charAt(0);
            } while(continuar!='S' && continuar!='N');
        } while(continuar=='S' && fin<=1000);
    }    
}
