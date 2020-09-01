import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=10;
        int [] arreglo = new int[n];
        int opcion=0;
        int i=0;
        arreglo[2]=25;
        arreglo[4]=20;
        do {
            System.out.println("***************MENU**********************");
            System.out.println("*                                       *");
            System.out.println("*                                       *");
            System.out.println("*    1. Agregar edad de persona         *");
            System.out.println("*    2. Calcular promedio edad          *");
            System.out.println("*    3. Buscar edad                     *");
            System.out.println("*    --------------------------         *");
            System.out.println("*    0. Salir                           *");
            System.out.println("*                                       *");
            System.out.println("*                                       *");
            System.out.println("*****************************************");
            System.out.println("Digite su opcion:");
            opcion=leer.nextInt();
            switch(opcion) {
                case 1:
                    if (i<arreglo.length) {
                    System.out.println("Digite la edad de la persona "+(i+1));
                    arreglo[i]=leer.nextInt();
                    i++;
                    } else {
                        System.out.println("Almacenamiento lleno ");
                    }
                    break;
                case 2:
                    if (i>0) {
                        double suma=0.0;
                        for (int j=0; j<i; j++) {
                            suma=suma+arreglo[j];
                        }
                        double promedio = suma/i;
                        System.out.println("El promedio es:"+promedio);
                    } else {
                        System.out.println("Arreglo sin datos");
                    }
                    break;
                case 3:
                    System.out.println("Digite la edad que desea buscar ");
                    int edad = leer.nextInt();
                    int flag=0;
                    for (int j=0; j<i; j++) {
                        if (edad==arreglo[j]) {
                            System.out.println("La edad si esta en el arreglo");
                            flag=1;
                            break;
                        }
                    }
                    if (flag==0) {
                        System.out.println("La edad no esta en el arreglo");
                    }
                            
                    break;
            }
        } while(opcion!=0);
    }
    
}
