
import java.util.Scanner;

public class DatosPersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre="";
        int edad=0;
        int sexo=0;
        System.out.println("Digite el nombre");
        nombre=leer.nextLine();
        System.out.println("Digite la edad");
        edad=leer.nextInt();
        System.out.println("Digite el sexo [1. Mas, 2.Fem]");
        sexo=leer.nextInt();
        if (edad>=18 && sexo==1) {
            System.out.println(nombre);
        } else if (sexo==2 || sexo==1) {
            System.out.println(nombre+" "+edad);
        } else {
            System.out.println("Valor del sexo no valido");
        }
    }
    
}
