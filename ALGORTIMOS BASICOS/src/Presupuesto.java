
import java.util.Scanner;

public class Presupuesto {
            
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float presupuesto=0.0F, valorPed=0.0F, valorTra=0.0F, valorGine=0.0F;
        System.out.println("Digite el presupuesto:");
        presupuesto=leer.nextFloat();
        valorGine=presupuesto*0.40F;
        valorTra=presupuesto*0.30F;
        valorPed=presupuesto*0.30F;
        
        System.out.println("El presupuesto asignado a Pedriatria es "+
        String.format("%.2f", valorPed)); 
        System.out.println("El presupuesto asignado a Traumatologia es: "+
                (int)valorTra);
        System.out.printf("El presupuesto asignado a Ginecologia es %.1f \n",
        valorGine);
        
    }
    
    
}
