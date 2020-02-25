
import java.util.Scanner;

public class Quick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 15;
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            int numero = (int) ((Math.random() * 20) + 1);
            arreglo[i] = numero;
        }

        imprimir(arreglo);
        quicksort(arreglo, 0, n-1);
        imprimir(arreglo);

    }

    private static void quicksort(int[] a, int l, int r) {
        int i, j, v;
        if (r > l) {
            v = a[r];
            i = l - 1;
            j = r;
            for (;;) {
                while (a[++i] < v && i < r);
                while (a[--j] > v && j > l);
                if (i >= j) {
                    break;
                }
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            {
                int temp = a[i];
                a[i] = a[r];
                a[r] = temp;
            }
            quicksort(a, l, i - 1);
            quicksort(a, i + 1, r);
        }
    }

    private static void imprimir(int[] a) {
        System.out.println("");
        System.out.print("arreglo = [");
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print(a[i]);
            } else {
                System.out.print("," + a[i]);
            }

        }
        System.out.println("]");
    }

}
