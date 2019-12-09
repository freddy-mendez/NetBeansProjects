
import java.util.Scanner;

public class Inversion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad invertida de la persona 1");
        float dp1 = leer.nextFloat();
        System.out.println("Digite la cantidad invertida de la persona 2");
        float dp2 = leer.nextFloat();
        System.out.println("Digite la cantidad invertida de la persona 3");
        float dp3 = leer.nextFloat();
        if (dp1!=dp2 && dp2!=dp3 && dp1!=dp3) {
            float total=dp1+dp2+dp3;
            float porcentajeP1 = (dp1*100)/total;
            float porcentajeP2 = (dp2*100)/total;
            float porcentajeP3 = (dp3*100)/total;
            System.out.println("Los porcentajes de inversión son: "
                    +porcentajeP1+" "+porcentajeP2+" "+porcentajeP3);
        } else {
            System.out.println("Las inversiones deben ser diferentes");
        }
            
                
    }
    
}
