import java.util.Scanner;

public class VentaAutos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 5;//100
        int contador=1;
        while (n>0) {
            System.out.println("Datos Vendedor "+contador);
            float suma=0;
            for (int i=1; i<=12; i++) {
                System.out.println("Digite el valor de las ventas de mes "+i);
                float valor = leer.nextFloat();
                suma=suma+valor;
            }
            System.out.println("Las ventas anuales son de: "+suma);
            float comision = 0.0F;
            if (suma>=1000000 && suma<3000000) {
                comision= 0.03F;
            } else if (suma>=3000000 && suma<5000000) {
                comision= 0.04f;
            } else if (suma>=5000000 && suma<7000000) {
                comision= 0.05f;
            } else if (suma>=7000000) {
                comision= 0.06f;
            }
            System.out.println("La comision sobre las "
                    + "ventas es: "+(suma*comision));
            contador++;
            n--;
        }
    }
    
}
