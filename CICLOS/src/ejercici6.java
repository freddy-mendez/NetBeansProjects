
import java.util.Scanner;

public class ejercici6 {

    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
 int contraseña=0;
 int intentos=0;			
 while(contraseña!=4567){
 System.out.print("introduzca la contraseña: ");
   contraseña=leer.nextInt();
      if(intentos==2){
          System.out.println("contraseña incorrecta..");
                 }
		  intentos++;
		 }
 System.out.println("contraseña correcta...");
 System.out.println("numero de intentos:"+intentos);
			
	}

}
