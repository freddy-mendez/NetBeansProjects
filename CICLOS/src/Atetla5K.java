import java.util.Scanner;

public class Atetla5K {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 3, contMas16=0;
        float sumaTiempos=0;
        for (int i=1; i<=n; i++) {
            System.out.println("Digite el tiempo en minutos:");
            int tiempo=leer.nextInt();
            if (tiempo>16) {
                contMas16++;
            }
            sumaTiempos+=tiempo;
        }
        if (contMas16==0 || contMas16==1) {
            System.out.println("Aprobado para la 5K");
        } else if ((sumaTiempos/n)<15) {
            System.out.println("Aprobado para la 5K");
        } else {
            System.out.println("NO Aprobado para la 5K");
        }
    }
}
