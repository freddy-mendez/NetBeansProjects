
import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float dato = 0;
        int menor = 0, mayor = 0;
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Digite la calificación "+(i+1)+" [0.0 - 5.0]");
                dato = leer.nextFloat();
            } while (dato < 0.0 || dato > 5.0);
            //if (dato >= 0.0 && dato <= 5.0) {
                if (dato >= 3.5) {
                    mayor++;
                } else if (dato < 3.5) {
                    menor++;
                }
//            } else {
//                i--;
//            }
        }
        System.out.println("El # de calificaciones mayores o iguales a 3.5 es " + mayor);
        System.out.println("El # de calificaciones menores a 3.5 es " + menor);
    }
}
