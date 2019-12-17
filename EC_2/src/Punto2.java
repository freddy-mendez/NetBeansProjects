
public class Punto2 {

    public static void main(String[] args) {
        int contador=0, suma=0;
        for (int n = 1; n <= 100; n++) {
            int div=0;
            if (n > 1) {
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        div++;
                    }
                }
                if (div == 1) {
                    System.out.println(n+" Es Primo");
                    suma=suma+n;
                    contador++;
                }
            }
        }
        System.out.println("Sumatoria numeros Primos es "+suma);
        System.out.println("Promedio numeros Primos es "+(suma/(float)contador));
    }

}
