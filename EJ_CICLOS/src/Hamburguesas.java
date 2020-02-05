
import java.util.Scanner;

public class Hamburguesas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opt = 0, tipo = 0, cantidad = 0, total = 0, pago=0;
        do {
            System.out.println("Seleccione una opción para realizar una operación");
            System.out.println("1. Comprar Hamburguesas");
            System.out.println("--------------------------");
            System.out.println("0. Salir");
            opt = leer.nextInt();
            switch (opt) {
                case 1:
                    tipo = 0;
                    cantidad = 0;
                    total = 0;
                    do {
                        System.out.println("Seleccione tipo de Hamburguesa");
                        System.out.println("1. Sencilla");
                        System.out.println("2. Doble");
                        System.out.println("3. Triple");
                        System.out.println("--------------------------");
                        System.out.println("0. Salir");
                        tipo = leer.nextInt();
                        if (tipo!=0) {
                            System.out.println("Digite el # de hamburguesas");
                            cantidad = leer.nextInt();
                            switch(tipo) {
                                case 1:
                                    total = total + (cantidad*20);
                                    break;
                                case 2:
                                    total = total + (cantidad*25);
                                    break;
                                case 3:
                                    total = total + (cantidad*28);
                                    break;
                            }
                        }
                    } while (tipo != 0);
                    do {
                    System.out.println("Paga con 1. TC o 2. Efectivo");
                    pago = leer.nextInt();
                    } while(pago<1 || pago>2);
                    if (pago==1) {
                        total = (int) (total * 1.05);
                    }
                    System.out.println("Total a pagar: "+total);
                    System.out.println("Gracias, por su compra");
                    break;
                case 0:
                    System.out.println("Gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("opción no valida");
            }
        } while (opt != 0);

    }

}
