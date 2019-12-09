
import java.util.Scanner;

public class HombreMujeres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite le numero de personas");
        int n = leer.nextInt();
        int contH=0, contM=0;
        for (int i=1; i<=n; i++) {
        //int i=1;
        //while(i<=n) {
            char sexo = 0;
            //do {
                System.out.println("Digite cual es el sexo [H o M] de la persona "+i);
                sexo=leer.next().toLowerCase().charAt(0);
            //} while (sexo!='H' && sexo!='M');
            if(sexo=='h') {
                contH++;
            } else if (sexo=='m') {
                contM++;
            }
            //i++;
        }
        System.out.println("Numero de Hombres "+
                contH+" Numero de mujeres "+contM);
    }
    
}
