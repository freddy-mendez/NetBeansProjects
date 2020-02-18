

    import java.util.Scanner;

public class EJ7 {

    public static void main(String[] args) {
     Scanner usuario= new Scanner(System.in);
		int login=0;
		int pass=0;
		int intentos=1;
		int maximo=1000;
			
				while((login!=1906552)||(pass!=4567)&& (intentos<maximo)){
					
                                    System.out.print("Recuerda que el Usuario es 1906552");
                                    System.out.println("");
                                    
					System.out.print("Digite su Usuario: ");
					login=usuario.nextInt();
                                        
					System.out.print("Digite su Contraseña: ");
					pass=usuario.nextInt();
					System.out.println("");
					if(intentos==100){
						System.out.println("Verifique si la contraseña/usuario son correctos");
						intentos=intentos-maximo;
					}
                                }
    }
}
				