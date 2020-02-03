import java.util.Scanner;
public class NewClass {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hora = 0, minuto = 0, valortiempo = 0;
        System.out.println("Valor de la hora: $1500");
        System.out.println("Ingree las hoas que estuvo en el estacionamiento");
        hora = leer.nextInt();
        System.out.println("Ingree los minutos que estuvo en el estacionamiento");
        minuto = leer.nextInt();

        if (minuto > 0) {
            valortiempo = (hora * 1500) + 1500;
            System.out.println("El valor a pagar es: $" + valortiempo);
        } else {
            valortiempo = (hora * 1500);
            System.out.println("El valor a pagar es: $" + valortiempo);
        }
    }
}
