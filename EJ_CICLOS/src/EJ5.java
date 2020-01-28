import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero n numeros que quiere ingresar ");
        int n = leer.nextInt();
        int numero = 0, pares = 0, impares = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite un numero entero [" + (i + 1) + "/" + n + "]");
            numero = leer.nextInt();
            if (numero%2==0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("El # de numeros pares son " + pares);
        System.out.println("El # de numeros impares son " + impares);
    }
}