
import java.util.Scanner;

public class CalificacionGeneral {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la información del curso de matematicas");
        System.out.println("Digite la calificación del examen");
        float e1 = leer.nextFloat();
        System.out.println("Digite la calificación de las tareas");
        float t1=0,t2=0,t3=0;
        t1=leer.nextFloat();
        t2=leer.nextFloat();
        t3=leer.nextFloat();
        float califX = (e1*0.9F)+(((t1+t2+t3)/3)*0.1F);
        System.out.println("La calificación final de matematicas es:"+califX);
        System.out.println("Digite la información del curso de Fisica");
        System.out.println("Digite la calificación del examen");
        e1 = leer.nextFloat();
        System.out.println("Digite la calificación de las tareas");
        t1=leer.nextFloat();
        t2=leer.nextFloat();
        float califY = (e1*0.8F)+(((t1+t2)/2)*0.2F);
        System.out.println("La calificación final de Física es:"+califY);
        System.out.println("Digite la información del curso de Quimica");
        System.out.println("Digite la calificación del examen");
        e1 = leer.nextFloat();
        System.out.println("Digite la calificación de las tareas");
        t1=leer.nextFloat();
        t2=leer.nextFloat();
        t3=leer.nextFloat();
        float califZ = (e1*0.85F)+(((t1+t2+t3)/3)*0.15F);
        System.out.println("La calificación final de Quimica es:"+califZ);
        System.out.println("El promedio general es:"+((califX+califY+califZ)/3));
        
        
    }
    
}
