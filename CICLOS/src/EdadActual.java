
import java.util.Calendar;
import java.util.Scanner;

public class EdadActual {

    public static void main(String[] args) {
        //Date fecha = new Date();
        Calendar fecha = Calendar.getInstance();
        System.out.println(fecha.get(Calendar.DAY_OF_MONTH));
        System.out.println(fecha.get(Calendar.MONTH)+1);
        System.out.println(fecha.get(Calendar.YEAR));
        System.out.println(fecha.get(Calendar.DAY_OF_YEAR));
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la fecha de nacimiento [dd/MM/YYYY]");
        String fechaNacimiento = leer.next();
        String [] valores = fechaNacimiento.split("/");
        int dia = Integer.parseInt(valores[0]);
        int mes = Integer.parseInt(valores[1]);
        int anio = Integer.parseInt(valores[2]);
        System.out.println("Digite la fecha de nacimiento ["+dia+"/"+mes+"/"+anio+"]");
        //if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
        int sumaDias = 0;
        int dias=365;
        for (int i=anio; i<=fecha.get(Calendar.YEAR); i++) {
            if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
                dias=366;
            } else {
                dias=365;
            }
            if (i==anio || i==fecha.get(Calendar.YEAR)) {
                if (i==anio) {
                    Calendar fechaN = Calendar.getInstance();
                    fechaN.set(anio, mes-1, dia);
                    sumaDias=sumaDias+(dias-fechaN.get(Calendar.DAY_OF_YEAR));
                } else {
                    sumaDias=sumaDias+fecha.get(Calendar.DAY_OF_YEAR);
                }
            } else {
                sumaDias=sumaDias+dias;
            }
        }
        System.out.println("Numero de dias vividos: "+sumaDias);
    }
    
}
