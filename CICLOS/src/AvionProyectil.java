public class AvionProyectil {

    public static void main(String[] args) {
        float velIni = 222.22F; // 800 km/h
        float acelAv = 20; // m/seg^2
        float acelPro = 10; // m/seg^2
        float distacia = 0;
        int tiempo = 1;
        while (distacia<10000) {
            float distanciaAvion = (velIni*tiempo)+((acelAv * (float) Math.pow(tiempo, 2))/2);
            float distanciaProyectil = (velIni*tiempo)+((acelPro * (float) Math.pow(tiempo, 2))/2);
            distacia = (float) Math.sqrt((float) Math.pow(distanciaAvion, 2) + 
                    (float) Math.pow(distanciaProyectil, 2));
            System.out.println("Distancia en el tiempo "+tiempo+" es "+distacia);
            System.out.println("Distancia Av "+distanciaAvion+" -- Distancia Proy "+distanciaProyectil);
            tiempo++;
        }
        
    }
    
}
