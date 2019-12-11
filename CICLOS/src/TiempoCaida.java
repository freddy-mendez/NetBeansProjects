public class TiempoCaida {
    
    public static void main(String[] args) {
        int h = 5; //altura
        final float G = 9.8F;
        int t = (int) Math.sqrt((2*h)/G);
        t=t*10;
        float tiempoTrascurrido = 0.1f;
        while(t>0) {
            float distancia = (G*((float)Math.pow(tiempoTrascurrido, 2)))/2;
            System.out.print("Tiempo en decimas "+t+"\t");
            System.out.println("Distancia al suelo es "+(h-distancia));
            t--;
            tiempoTrascurrido=tiempoTrascurrido+0.1F;
        }
    }
    
}
