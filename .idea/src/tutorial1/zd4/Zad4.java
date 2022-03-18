package tutorial1.zd4;

public class Zad4 {

    public static void main(String[] args) {
        String message = "Hello World!";
        int i = 0;
        while(i<10){
            System.out.println(message);
            i++;
        }
        System.out.println("----");
        i = 0;
        do{
            System.out.println(message);
            i++;
        } while(i<10);
        System.out.println("----");
        for(i=0;i<10;i++)
            System.out.println(message);
    }
}
