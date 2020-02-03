package avanzado;

public class Clase_Deposito extends cajeroautomatico{
   @Override
   public void transacciones(){
       System.out.println("Cuanto deseas depositar: ");
       deposito();
       transacciones=getSaldo();
       setSaldo(transacciones+deposito);
       System.out.println("--------------------------------");
       System.out.println("Depositaste"+deposito);
       System.out.println("Tu saldo actual es:"+getSaldo());
       System.out.println("--------------------------------");
   }
}
