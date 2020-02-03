
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
                //123
                
                //123%10 = 3
                //123/100 = 1
                //123/10 = 12%10 = 2
                
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int numero = leer.nextInt();
        boolean positivo = false;
        if (numero>=0) {
            positivo=true;
        } else {
            numero = numero*(-1);
        }
        int centena = numero / 100;
        int decena = (numero/10)%10;
        int unidad = numero % 10;
        
        int mayor=0, medio=0, menor=0;
        
        System.out.println(centena+" "+decena+" "+unidad);
        
        if (centena>=decena && centena>=unidad) {
            mayor=centena;
        } else if (decena>=centena && decena>=unidad) {
            mayor=decena;
        } else if (unidad>=centena && unidad>=decena) {
            mayor=unidad;
        }
        
        if (centena<=decena && centena<=unidad) {
            menor=centena;
        } else if (decena<=centena && decena<=unidad) {
            menor=decena;
        } else if (unidad<=centena && unidad<=decena) {
            menor=unidad;
        }
        
        medio = (unidad+decena+centena) - (mayor+menor);
        
        int nuevoNumero = 0;
        
        if (!positivo) {
            nuevoNumero = (menor*100)+(medio*10)+mayor;
            nuevoNumero=nuevoNumero*(-1);
        } else {
            nuevoNumero = (mayor*100)+(medio*10)+menor;
        }
        
        System.out.println("El numero es "+nuevoNumero);
                
    }
    
}
