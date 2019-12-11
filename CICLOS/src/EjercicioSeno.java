import java.util.Scanner;

public class EjercicioSeno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int termino=0;
        float angulo=0;
        float serie=0;
        System.out.println("Digite el valor del angulo en radianes");
        angulo = leer.nextFloat();
        System.out.println("Digite el valor del termino de la serie");
        termino=leer.nextInt();
        boolean par=true;
        int i=0;
        while(termino>0) {
            if (par==true) { //if ((i%2)==0)
                serie=serie+((float) Math.pow(angulo, 2*i+1)/factorial(2*i+1));
                par=false;
            } else {
                serie=serie-((float) Math.pow(angulo, 2*i+1)/factorial(2*i+1));
                par=true;
            }
            i++;
            termino--;
        }
        System.out.println("El valor de la serie es "+String.format("%.2f", serie));
    }

    private static long factorial(int n) {
        long fact=1;
        for (int i=1; i<=n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    
}
