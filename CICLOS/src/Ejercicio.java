
public class Ejercicio {

    public static void main(String[] args) {
     int num=0,producto=1, i=1;
//       for(i=1;i<=50;i++){
//            if (i%3==0) {
//                producto=producto*i;
//            }
//        } 
//        System.out.println(producto);
        
     while (i<=50) {
         if (i%3==0){
             producto=producto*i;
             
         }
         i++;
     }  System.out.println(producto);

    }
    
}
