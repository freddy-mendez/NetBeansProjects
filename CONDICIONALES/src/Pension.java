
import java.util.Scanner;

public class Pension {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la edad de la persona");
        int edad=leer.nextInt();
        System.out.println("Digite la antiguedad laboral de la persona");
        int antiguedad=leer.nextInt();
        if (edad>=60 && antiguedad>=25) {
            System.out.println("Jubilacion Antiguedad Adulta");
        } else if (edad>=60 && antiguedad<25) {
            System.out.println("Jubilacion Edad");
        } else if (edad<60 && antiguedad>=25) {
            System.out.println("Jubilacion Antiguedad Joven");
        } else {
            System.out.println("Siga trabajando!!");
        }
    }
    
}
