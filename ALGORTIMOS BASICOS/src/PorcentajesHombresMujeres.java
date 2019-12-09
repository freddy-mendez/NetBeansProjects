
import java.util.Scanner;


public class PorcentajesHombresMujeres {

    public static void main(String[] args) {
        int numeroEstudiantes = 1;
        int numeroMujeres = 1;
        System.out.println("Escriba el numero de estudiantes");
        Scanner leer = new Scanner(System.in);
        numeroEstudiantes = leer.nextInt();
        System.out.println("Escriba el numero de estudiantes mujeres");
        numeroMujeres=leer.nextInt();
        float porcentajeMuj = (numeroMujeres*100.0F)/numeroEstudiantes;
        float porcentajeHom = ((numeroEstudiantes-numeroMujeres)*100.0F)/numeroEstudiantes;
        System.out.printf("El porcentaje de hombres es :%.0f y el de mujeres es: %.0f", porcentajeHom, porcentajeMuj);

    }
    
}
