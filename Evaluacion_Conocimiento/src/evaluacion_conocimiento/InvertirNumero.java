package evaluacion_conocimiento;

import java.util.Scanner;

public class InvertirNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, numInv = 0;
        System.out.println("Escriba el numero entero de 6 cifras");
        num = leer.nextInt();
        while (num > 10) {
            numInv = numInv * 10 + (num % 10);
            num = num / 10;
        }
        numInv = numInv * 10 + num;
        System.out.println(numInv);

    }
}
