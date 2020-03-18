import java.util.Scanner;
public class EstadoCivil {
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre="";
        int edad=0;
        int sexo=0;
        int estadoCivil = 0;
        System.out.println("Digite el nombre");
        nombre=leer.next();
        System.out.println("Digite la edad");
        edad=leer.nextInt();
        System.out.println("Digite el sexo [1. Mas, 2.Fem]");
        sexo=leer.nextInt();
        System.out.println("Digite el estado civil"
                + " [1. Soltero, 2.Casado, 3. Otro]");
        estadoCivil=leer.nextInt();
        if (sexo==2 && edad<18) {
            System.out.println(nombre+" "+edad);
        } else {
            switch(estadoCivil) {
                case 1:
                    System.out.println("Estado civil Solter"+((sexo==1)?"o":"a"));
                    break;
                case 2:
                    System.out.println("Estado civil Casad"+((sexo==1)?"o":"a"));
                    break;
                case 3:
                    System.out.println("Estado civil Otro");
                    break;
                default:
                    System.out.println("Estado civil no valido");
            }
        }
    }
}
