package tutorial1.zd3;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Input a: ");
        arr[0] = scanner.nextInt();
        System.out.print("Input b: ");
        arr[1] = scanner.nextInt();
        System.out.print("Input c: ");
        arr[2] = scanner.nextInt();

        int tmp;
        if(arr[2] < arr[0]){
            tmp = arr[0];
            arr[0] = arr[2];
            arr[2] = tmp;
        }
        if(arr[2] < arr[1]){
            tmp = arr[2];
            arr[2] = arr[1];
            arr[1] = tmp;
        }
        if(arr[1] < arr[0]){
            tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }

        System.out.println("Najmniejsza wartość: " + arr[0]);
        System.out.println("Średnia wartość: " + arr[1]);
        System.out.println("Największa wartość: " + arr[2]);
    }
}

