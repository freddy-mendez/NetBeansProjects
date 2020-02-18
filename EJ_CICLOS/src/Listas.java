import java.util.*;
public class Listas {
    
    public static void main (String[] args)
    {        
    ArrayList<Integer> lista1 = new ArrayList< Integer>();
    ArrayList<Integer> lista2 = new ArrayList< Integer>();
    
    int cantidad1 = (int) (Math.random()*(15-5+1)+5);
    int cantidad2 = (int) (Math.random()*(20-10+1)+10);
    
    for (int x=0;x<cantidad1;x++) {lista1.add((int)(Math.random()*(550-50+1)+50));}
    for (int x=0;x<cantidad2;x++) {lista2.add((int)(Math.random()*(550-50+1)+50));}
    
    System.out.println(lista1);
    System.out.println(lista2);
    
    ArrayList<Integer> lista3 = new ArrayList<Integer>();
    String seEncuentra="no";
    for(int x=0;x<lista1.size();x++)
    { seEncuentra="no";
        for(int y=0;y<lista2.size();y++)
        {
            if(lista1.get(x)==lista2.get(y))
        {
            seEncuentra="si";
        }    
    }
    if (seEncuentra.equals("no"))
    {
        lista3.add(lista1.get(x));
       
    }    
        
}
    System.out.println(lista3);
    ArrayList<Integer> lista4 = new ArrayList<Integer>();
    
    for(int x=0;x<lista1.size();x++){
        if(lista1.get(x)%2 ==0)
        {
            lista4.add(lista1.get(x));
        }    
    }
    for(int x=0;x<lista2.size();x++) {
        if(lista2.get(x)% 2 ==1)
        {
         lista4.add(lista2.get(x));
        }
    }
    System.out.println(lista4);
    }
}
    

