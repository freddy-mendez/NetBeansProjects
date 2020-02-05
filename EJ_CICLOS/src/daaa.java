import java.util.Scanner;
public class daaa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, num2;
        System.out.println("Digite la altura");
        num = leer.nextInt();

        String array1[] = new String[num];
        String array2[] = new String[num];

        for (int i = 0; i < num; i++) {
            array1[i] = "*";
        }
        for (int j = 0; j < num; j++) {
            if (j == 0) {
                array2[j] = "*";
            } else {
                array2[j] = " ";
            }
            if (j == num - 1) {
                array2[j] = "*";
            }
        }
        num2 = (num - 2);
        for (int i = 0; i < num; i++) {
            System.out.print(" " + array1[i]);
        }
        for (int i = 0; i < num2; i++) {
            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print(" " + array2[j]);
            }
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println();
    }
}
