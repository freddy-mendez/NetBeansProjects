import java.util.Scanner;
public class EJ12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0, numero;
        for (int i=0; i<10; i++) {
            System.out.println("Digite un numero entero");
            numero=leer.nextInt();
            if (numero<0) {
                suma=suma+numero;
            }
        }
        System.out.println("La suma de los numeros negativos es " + suma);
    }
}
