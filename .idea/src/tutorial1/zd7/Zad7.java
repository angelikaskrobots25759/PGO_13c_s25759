package tutorial1.zd7;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        int n = 3;
        Scanner scanner = new Scanner(System.in);
        while(n % 2 == 0 || n < 4){
            System.out.print("Wprowadź liczbę nieparzystą większą od 4: ");
            n = scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        int offset = 0;
        for(int i=0;i<n-2;i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                if(j==offset)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            offset++;
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
