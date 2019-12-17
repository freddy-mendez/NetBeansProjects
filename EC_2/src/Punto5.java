public class Punto5 {
    public static void main(String[] args) {
        for (int i=1; i<=50; i++) {
            System.out.print(i+". ");
            if (i%3==0) {
                System.out.print(" Foo ");
            }
            if (i%5==0) {
                System.out.print(" Biz ");
            }
            if (i%7==0) {
                System.out.print(" Bar ");
            }
            System.out.println("");
        }
    }
}
