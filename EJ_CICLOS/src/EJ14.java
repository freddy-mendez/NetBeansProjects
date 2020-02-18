
import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero entero [1/3]");
        int num1=leer.nextInt();
        System.out.println("Digite un numero entero [2/3]");
        int num2=leer.nextInt();
        System.out.println("Digite un numero entero [3/3]");
        int num3=leer.nextInt();
        System.out.println("Los numeros ordenados ascendentemente son:");
        if (num1<=num2) {
            if (num2<=num3) {
                System.out.println(num1+" "+num2+" "+num3);
            } else if (num1<=num3) {
                System.out.println(num1+" "+num3+" "+num2);
            } else {
                System.out.println(num3+" "+num1+" "+num2);
            }
        } else if (num2<=num3) {
            if (num1<=num3) {
                System.out.println(num2+" "+num1+" "+num3);
            } else {
                System.out.println(num3+" "+num2+" "+num1);
            }  
        } 
    }
}
