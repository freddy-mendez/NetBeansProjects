
import java.util.Scanner;

public class NumerosCiclos {

    public static void main(String[] args) {
        //Pedir 10 numeros e imprimir el promedio de los mismos.
        Scanner leer = new Scanner(System.in);
//        int suma=0;
//        for (int i=1; i<=10; i++) {
//            System.out.println("Digite un numero entero");
//            int n = leer.nextInt();
//            suma = suma + n;
//        }
//        System.out.println("El promedio es "+(suma/10.0));

//        int suma=0;
//        int i=1;
//        while (i<=10) {
//            System.out.println("Digite un numero entero");
//            int n = leer.nextInt();
//            suma = suma + n;
//            i++;
//        }
//        System.out.println("El promedio es "+(suma/10.0));
        int suma = 0;
        int i = 1;
        do {
            System.out.println("Digite un numero entero");
            int n = leer.nextInt();
            suma = suma + n;
            i++;
        } while (i <= 10);
        System.out.println("El promedio es " + (suma / 10.0));

    }

}
