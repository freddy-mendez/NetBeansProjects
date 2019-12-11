import java.util.Scanner;

public class Gallinas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de Gallinas");
        int n = leer.nextInt();
        int indice=0;
        float sumaCalidad=0;
        float precioKilo=0;
        while(indice<n) {
            System.out.println("Datos Gallina "+(indice+1));
            System.out.println("Digite el peso (gramos)");
            float peso=leer.nextFloat();
            System.out.println("Digite la altura (centimetros)");
            float altura=leer.nextFloat();
            System.out.println("Digite numero de huevos semanales ");
            int numHuevos=leer.nextInt();
            float calidad=(peso*altura)/numHuevos;
            sumaCalidad=sumaCalidad + calidad;
            indice++;
        }
        float promedioCalidad = sumaCalidad/n;
        if (promedioCalidad>=15) {
            precioKilo=1.2F*promedioCalidad;
        } else if (promedioCalidad>8 && promedioCalidad<15) {
            precioKilo=1*promedioCalidad;
        } else if (promedioCalidad<=8) {
            precioKilo=(float)(0.8*promedioCalidad);
        }
        System.out.println("El promedrio de calidad es "+promedioCalidad);
        System.out.println("El precio por kilo es "+precioKilo);
    }
    
}
