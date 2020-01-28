import java.util.Scanner;
public class EJ9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero=0, suma=0;
        do {
            System.out.println("Digite un numero, cero para salir");
            numero=leer.nextInt();
            suma=suma+numero;
        } while (numero!=0);
        System.out.println("La suma de los numeros es " + suma);
    }
}
