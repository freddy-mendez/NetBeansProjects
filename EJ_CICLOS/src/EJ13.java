
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean isNum1, isNum2, isNum3, isNum4, isNum5;
        isNum1=isNum2=isNum3=isNum4=isNum5=false;
        int num, num1, num2, num3, num4, num5, contador=0;
        num1=(int)((Math.random()*10)+1);
        do {
        num2=(int)((Math.random()*10)+1);
        } while(num2==num1);
        do {
        num3=(int)((Math.random()*10)+1);
        } while(num3==num1 || num3==num2);
        do {
        num4=(int)((Math.random()*10)+1);
        } while(num4==num1 || num4==num2 || num4==num3);
        do {
        num5=(int)((Math.random()*10)+1);
        } while (num5==num1 || num5==num2 || num5==num3 || num5==num4);
        System.out.println("Adivine 5 numeros entre 1 y 10");
        System.out.println(num1+"-"+num2+"-"+num3+"-"+num4+"-"+num5);
        do {
            System.out.println("["+contador+"/5] Aciertos");
            System.out.println("Digite un numero entre 1 y 10");
            num=leer.nextInt();
            if (!isNum1 && num==num1) {
                isNum1=true;
                contador++;
            }
            if (!isNum2 && num==num2) {
                isNum2=true;
                contador++;
            }
            if (!isNum3 && num==num3) {
                isNum3=true;
                contador++;
            }
            if (!isNum4 && num==num4) {
                isNum4=true;
                contador++;
            }
            if (!isNum5 && num==num5) {
                isNum5=true;
                contador++;
            }
        } while(!isNum1 || !isNum2 || !isNum3 || !isNum4 || !isNum5);
        System.out.println("Muy bien, adivino los 5 numeros");
    }
}
