
import java.util.Scanner;

public class Transito {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de Vehiculos");
        int n = leer.nextInt();
        int contAm=0, contRosa=0, contRoja=0, contVer=0, contAz=0;
        for (int i=0; i<n; i++) {
            System.out.println("Digite el ultimo digito de la placa [0-9]");
            int digito = leer.nextInt();
            if (digito==1 || digito==2) {
                contAm++;
            } else if (digito==3 || digito==4) {
                contRosa++;
            } else if (digito==5 || digito==6) {
                contRoja++;
            } else if (digito==7 || digito==8) {
                contVer++;
            } else if (digito==9 || digito==0) {
                contAz++;
            }
        }
        System.out.println("Vehiculos con calcomania Amarilla:"+contAm);
        System.out.println("Vehiculos con calcomania Rosa:"+contRosa);
        System.out.println("Vehiculos con calcomania Roja:"+contRoja);
        System.out.println("Vehiculos con calcomania Verde:"+contVer);
        System.out.println("Vehiculos con calcomania Azul:"+contAz);
        
        
        
        
        
    }    
}
