package avanzado;

public class Clase_Consulta extends cajeroautomatico {
    
     @Override
     public void transacciones(){
        System.out.println("------------------------------");
        System.out.println("Tu saldo actual es:"+getSaldo());
        System.out.println("------------------------------");
    
}
}