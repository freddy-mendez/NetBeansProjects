import java.util.Scanner;

public class InvertirBanco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 12;
        float interes = 0.02F;
        double valor=0.0;
        System.out.println("Digite el valor a invertir");
        valor=leer.nextDouble();
        while(n>0) {
            valor+=(valor*interes);//valor=valor+(valor*interes)
            n--;
        }
        System.out.println("Saldo despues del "
                + "año es: "+String.format("%.2f",valor));
    }
    
}
