package tutorial1.zd2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();

        int tmp;
        if(c < a){
            tmp = a;
            a = c;
            c = tmp;
        }
        if(c < b){
            tmp = c;
            c = b;
            b = tmp;
        }
        if(b < a){
            tmp = a;
            a = b;
            b = tmp;
        }



        System.out.println("Najmniejsza wartość: " + a);
        System.out.println("Średnia wartość: " + b);
        System.out.println("Największa wartość: " + c);
    }
}
