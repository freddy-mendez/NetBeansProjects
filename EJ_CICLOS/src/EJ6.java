import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int CLAVE = 4567;
        int passwd = 0;
        do {
            System.out.println("Digite la contraseña (Numerica)");
            passwd = leer.nextInt();
        } while (passwd != CLAVE);
    }
}
