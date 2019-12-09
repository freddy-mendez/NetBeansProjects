
import java.util.Scanner;

public class AreaDelTriangulo {

    
    public static void main(String[] args) {
        int base = 1;
        int height = 1;
        System.out.println("Escriba el valor de la base");
        Scanner leer = new Scanner(System.in);
        base = leer.nextInt();
        System.out.println("Escriba el valor de la altura");
        height=leer.nextInt();
        float area = (base*height)/2.0F;
        System.out.println("El valor del area es:"+String.format("%.2f", area));
        
        //System.out.println(area);
        
    }


}
