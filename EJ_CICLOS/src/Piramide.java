import java.util.Scanner;
public class Piramide {
    public static void main(String[] args) {
        Scanner leer = new java.util.Scanner(System.in);
        int altura = 0;
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
       // for (int i = altura, a = 1; a <= (altura * 2) - 1; i--, a += 2) {
          for (int i=1, a=19; a>=1; i++, a-=2){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int b = a; b != 0; b--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
