public class SumatoriaSerieFibo {

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 1;
        int suma=0;
        while (valor2<10000) {
            int temp=valor2;
            valor2 = valor1+valor2;
            valor1 = temp;
            System.out.print(""+valor2);
            if (valor2>100 && valor2<10000) {
                suma=suma+valor2;
                System.out.print("+++");
            }
            System.out.println("");
        }
        System.out.println("La sumatoria de los terminos es:"+suma);
    }
    
}
