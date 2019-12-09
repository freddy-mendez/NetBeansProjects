
package evaluacion_conocimiento;

import java.util.Scanner;


public class Numero {
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       int unidad,decena, centena, um,dm,cm;
       int num1, num2,num3, num4, numero;
       int c1, c2, c3, c4,c5;
               
        System.out.println("Escriba el numero entero de 6 cifras");
        num = leer.nextInt();
        unidad= num%10; //123456: 6
        num1= num/10; // 12345
        decena = num1%10; //5
        num2= num1/10; //1234
        centena= num2%10; //4
        num3= num2/10; // 123
        um= num3 %10; // 3
        num4= num3/10; // 12
        dm= num4%10; //2
        
        c1= unidad*100000;
        c2= decena*10000;
        c3= centena*1000;
        c4= um*100;
        c5= dm*10;
        numero=c1+c2+c3+c4+c5+(num4/10);
            
                 
        
        System.out.println("Numero invertido"+numero);
       
         
}
}
