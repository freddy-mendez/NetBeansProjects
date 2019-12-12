import java.util.Scanner;

public class EjercicioPizza {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite tamaño de la Pizza [P, M, G] ");
        char tamanho=leer.next().toUpperCase().charAt(0);
        System.out.println("Digite el numero de ingredientes extras");
        int extras=leer.nextInt();
        float costoPreparacion=5000;
        float costoProporcion=5000;
        float costoXextra=2000;
        switch(tamanho) {
            case 'P':
                costoProporcion=costoProporcion*0.5F;
                break;
            case 'M':
                costoProporcion=costoProporcion*1.0F;
                break;
            case 'G':
                costoProporcion=costoProporcion*1.5F;
                break;
        }
        float costoTotal = costoPreparacion+costoProporcion+(extras*costoXextra);
        System.out.println("El costo de la Pizza es:"+costoTotal);
    }
    
}
