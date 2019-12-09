
import java.util.Scanner;

public class HombresMujeresWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite le numero de alumnos");
        int n = leer.nextInt();
        int contH=0, contM=0;
        int i=1;
        while(i<=n) {
            char sexo = 0;
            System.out.println("Digite cual es el sexo [H o M] del alumno "+i);
            sexo=leer.next().toLowerCase().charAt(0);
            if(sexo=='h') {
                contH++;
            } else if (sexo=='m') {
                contM++;
            }
            i++;
        }
        System.out.println("Numero de Hombres "+
                contH+" Numero de mujeres "+contM);
    }
}
