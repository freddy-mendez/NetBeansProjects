
import java.util.Scanner;

public class PromediosGrupos {

    public static void main(String[] args) {
        float sumaGrupos=0, sumaAlumnos=0, sumaMaterias=0, sumaNotas=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de grupos");
        int g = leer.nextInt();
        int contGrupos=0;
        while(contGrupos<g) {
            sumaAlumnos=0;
            System.out.println("Datos Grupo "+(contGrupos+1));
            System.out.println("Digite el numero de Alumnos");
            int n = leer.nextInt();
            int contAlumnos=0;
            while(contAlumnos<n) {
                sumaMaterias=0;
                System.out.println("Datos Alumno "+(contAlumnos+1));
                System.out.println("Digite el numero de Materias");
                int m = leer.nextInt();
                int contMaterias=0;
                while(contMaterias<m) {
                    System.out.println("Datos Materia "+(contMaterias+1));
                    sumaNotas=0;
                    int contadorNotas=0;
                    while (contadorNotas<3) {
                        System.out.println("Digite la calificación");
                        float nota = leer.nextFloat();
                        sumaNotas=sumaNotas+nota;
                        contadorNotas++;
                    }
                    sumaMaterias=sumaMaterias+(sumaNotas/3);
                    contMaterias++;
                }
                System.out.println("El promedio del Alumno "+(contAlumnos+1)+" es "+(sumaMaterias/m));
                sumaAlumnos=sumaAlumnos+(sumaMaterias/m);
                contAlumnos++;
            }
            System.out.println("El promedio del Grupo "+(contGrupos+1)+" es "+(sumaAlumnos/n));
            sumaGrupos=sumaGrupos+(sumaAlumnos/n);
            contGrupos++;
        }
        System.out.println("El promedio General es "+(sumaGrupos/g));
    }
    
}
