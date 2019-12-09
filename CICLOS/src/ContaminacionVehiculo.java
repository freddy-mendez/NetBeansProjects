
import java.util.Scanner;

public class ContaminacionVehiculo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("Digite le numero de personas");
        int n = 5;
        float menosC=0, masC=0, sumaC=0;
        for (int i=1; i<=n; i++) {
            System.out.println("Digite los puntos "
                    + "contamiantes del vehiculo "+i);
            int puntos = leer.nextInt();
            if (i==1) {
                menosC=masC=puntos;
            }
            if (puntos<menosC) {
                menosC=puntos;
            }
            if (puntos>masC) {
                masC=puntos;
            }
            sumaC+=puntos;
        }
        System.out.println("Los puntos mas contaminantes son: "+masC);
        System.out.println("Los puntos menos contaminantes son: "+menosC);
        System.out.println("Los puntos promedios contaminantes son: "+(sumaC/(n*1.0)));
    }
    
}
