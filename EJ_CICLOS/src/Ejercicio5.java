import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String horaInicio = "";
        String horaFin = "";
        int valorHora = 1500;
        System.out.println("Ingree la hora de Inicio en el estacionamiento [HH:mm]");
        horaInicio=leer.next();
        System.out.println("Ingree la hora de Fin en el estacionamiento [HH:mm]");
        horaFin=leer.next();
        Calendar hIni = Calendar.getInstance();
        String [] data = horaInicio.split(":");
        hIni.set(Calendar.HOUR_OF_DAY, Integer.parseInt(data[0]));
        hIni.set(Calendar.MINUTE, Integer.parseInt(data[1]) );
        Calendar hFin = Calendar.getInstance();
        data = horaFin.split(":");
        hFin.set(Calendar.HOUR_OF_DAY, Integer.parseInt(data[0]));
        hFin.set(Calendar.MINUTE, Integer.parseInt(data[1]) );
        System.out.println(hIni.getTimeInMillis());
        System.out.println(hFin);
        long resultado = hFin.getTimeInMillis()-hIni.getTimeInMillis();
        System.out.println(((resultado/1000)/60)/60.0);
        int tiempoTotal = (int) Math.ceil(((resultado/1000)/60)/60.0);
        System.out.println(tiempoTotal);
        System.out.println("El valor a pagar es: "+(tiempoTotal*valorHora));
    }
    
}
