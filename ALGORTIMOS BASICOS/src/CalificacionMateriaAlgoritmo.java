
import java.util.Scanner;


public class CalificacionMateriaAlgoritmo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el valor de las 3 notas parciales");
        float nota1 = leer.nextFloat();
        float nota2 = leer.nextFloat();
        float nota3 = leer.nextFloat();
        System.out.println("Escriba el valor del examen");
        float examen = leer.nextFloat();
        System.out.println("Escriba el valor del trabajo");
        float trabajo = leer.nextFloat();
        float parcial = (nota1+nota2+nota3)/3;
        float total = (parcial*0.55F)+(examen*0.30F)+(trabajo*0.15F);
        System.out.println("Calificación final:"+total);
    }
    
}
