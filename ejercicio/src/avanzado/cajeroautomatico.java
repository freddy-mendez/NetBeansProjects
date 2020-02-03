package avanzado;

import java.util.Scanner;

public abstract class cajeroautomatico {

    protected int transacciones, deposito, retiro;
    private static int saldo;
    Scanner leer = new Scanner(System.in);

    public void operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("porfavor seleccione una opcion:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = leer.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println("opcion no disponible,vuelva a intentar porfavor.");
                    System.out.println("------------------------------------------------");
                }
            } while (bandera == 0);
            if (seleccion == 1) {
                cajeroautomatico mensajero=new Clase_Consulta();
                mensajero.transacciones();
            } else if (seleccion == 2) {
                cajeroautomatico mensajero=new Clase_Retiro();
                mensajero.transacciones();
            } else if (seleccion == 3) {
                cajeroautomatico mensajero=new Clase_Deposito();
                mensajero.transacciones();
            } else if (seleccion == 4) {
                System.out.println("-----------------------");
                System.out.println("¡Gracias,vuelva pronto.");
                System.out.println("-----------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    
    //Metodo para solictar cantidad de retiro
    public void retiro(){
        retiro=leer.nextInt();
    }
        
    //Metodo para solicitar deposito
    public void deposito(){
        deposito=leer.nextInt();
    }
    // Metodo abstracto
    public abstract void transacciones();
    
    //Metodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
       this.saldo=saldo; 
    }
}
