import java.util.Scanner;

public class HorasExtrasWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de Obreros");
        int n=leer.nextInt();
        double salario=0.0;
        int contador=0;
        while(contador<n) {
            System.out.println("Digite las horas trabajadas "
                    + "del obrero "+(contador+1));
            int horas = leer.nextInt();
            if (horas<=40) {
                salario=horas*20;
            } else if (horas>40) {
                salario = 40 * 20;
                salario += (horas-40)*25;
            }
            System.out.println("El salario del Obrero es: "+salario);
            contador++;
        }
    }    
}
