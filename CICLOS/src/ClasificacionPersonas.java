
import java.util.Scanner;

public class ClasificacionPersonas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de Personas");
        int n = leer.nextInt();
        int contMay=0, contMen=0, contMasMay=0, contFemMen=0;
        for (int i=0; i<n; i++) {
            //System.out.println("Digite la edad:");
            //int edad = leer.nextInt();//10-25
            int edad = ((int)(Math.random()*16))+10;
            System.out.print(edad);
            //System.out.println("Digite el sexo: [M o F]");
            //char sexo = leer.next().toUpperCase().charAt(0);
            char sexo = ((((int)(Math.random()*2))+1)==1?'M':'F');
            System.out.print(" "+sexo);
            if (edad>=18) {
                contMay++;
                System.out.print(" May ");
                if (sexo=='M') {
                    contMasMay++;
                    System.out.print(" MasMay "+sexo);
                }
            } else {
                contMen++;
                System.out.print(" Men ");
                if (sexo=='F') {
                    contFemMen++;
                    System.out.print(" FemMen ");
                }
            }
            System.out.println("");
        }
        System.out.println("Numero de personas Mayores:"+contMay);
        System.out.println("Numero de personas Menores:"+contMen);
        System.out.println("Numero de personas Masculinas Mayores:"+contMasMay);
        System.out.println("Numero de personas Femeninas Menores:"+contFemMen);
        System.out.println("% de personas Mayores:"+((contMay*100)/n));
        System.out.println("% de personas Menores:"+((contMen*100)/n));
        
    }
    
}
