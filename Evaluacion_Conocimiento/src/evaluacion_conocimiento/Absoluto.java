
 package evaluacion_conocimiento;
import java.util.Scanner;
public class Absoluto {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        float numero, valor_absoluto=0;
        System.out.println("Digite un número: ");
        numero=leer.nextFloat();
        valor_absoluto=Math.abs(numero);
                                 
         System.out.println("Valor aboluto del numero: "+valor_absoluto);
}
}
 
