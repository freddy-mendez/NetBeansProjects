import java.util.Scanner;
public class EJ3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero n de empleados ");
        int n = leer.nextInt();
        int salario=0, sumaSalarios=0, salarioMayores300=0, salarios100y300=0;
        for (int i=0; i<n; i++) {
            do {
                System.out.println("Digite el salario del empleado "+(i+1));
                salario = leer.nextInt();
            } while (salario < 100 || salario > 500);
            sumaSalarios=sumaSalarios+salario;
            if (salario>=100 && salario<=300) {
                salarios100y300++;
            } else if (salario>300) {
                salarioMayores300++;
            }
        }
        System.out.println("El # de empleados con salarios entre 100 y 300 es " + salarios100y300);
        System.out.println("El # de empleados con salarios mayores a 300 es " + salarioMayores300);
        System.out.println("El valor del importe de la empresa es: " + sumaSalarios);
    }
    
}
