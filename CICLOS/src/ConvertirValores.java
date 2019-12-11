
import java.util.Scanner;

public class ConvertirValores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero entero a convertir");
        int n = leer.nextInt();
        
        int binario=n;
        int residuo=0;
        int base=2;
        String numeroBinario="";
        while(binario>1) {
            residuo=binario%base;
            numeroBinario=residuo+numeroBinario;
            binario=binario/base;
        }
        numeroBinario=binario+numeroBinario;
        System.out.println("Binario: "+numeroBinario);
        
        base=8;
        numeroBinario="";
        binario=n;
        while(binario>7) {
            residuo=binario%base;
            numeroBinario=residuo+numeroBinario;
            binario=binario/base;
        }
        numeroBinario=binario+numeroBinario;
        System.out.println("Octal: "+numeroBinario);
        
        base=16;
        numeroBinario="";
        binario=n;
        while(binario>15) {
            residuo=binario%base;
            numeroBinario=valorHexa(residuo)+numeroBinario;
            binario=binario/base;
        }
        numeroBinario=valorHexa(binario)+numeroBinario;
        System.out.println("Hexadecimal: "+numeroBinario);
        
        
        
    }

    private static String valorHexa(int residuo) {
        String valor="";
        switch(residuo) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                valor=""+residuo;
                break;
            case 10:
                valor="A";
                break;
            case 11:
                valor="B";
                break;
            case 12:
                valor="C";
                break;
            case 13:
                valor="D";
                break;
            case 14:
                valor="E";
                break;
            case 15:
                valor="F";
        }
        return valor;
    }
    
}
