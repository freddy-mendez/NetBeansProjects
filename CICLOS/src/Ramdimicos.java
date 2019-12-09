public class Ramdimicos {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            int edad = ((int)(Math.random()*16))+10;
            System.out.print(edad);
            int sexo = ((int)(Math.random()*2))+1;
            System.out.println(" "+((sexo==1)?'M':'F'));
        }
    }
}
