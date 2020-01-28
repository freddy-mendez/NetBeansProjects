public class EJ11 {
    public static void main(String[] args) {
        int sumaPares=0, sumaImpares=0, contaPares=0, contaImpares=0;
        for (int i=1; i<=200; i++) {
            if (i%2==0) {
                sumaPares=sumaPares+i;
                contaPares++;
            } else {
                sumaImpares=sumaImpares+i;
                contaImpares++;
            }
        }
        System.out.println("La suma de pares ("+contaPares+") entre 1 y 200 es " + sumaPares);
        System.out.println("Y la media de los pares es "+ (sumaPares/(contaPares*1.0))) ;
        System.out.println("La suma de impares ("+contaImpares+") entre 1 y 200 es " + sumaImpares);
        System.out.println("Y la media de los pares es "+ (sumaImpares/(contaImpares*1.0))) ;
    }    
}
