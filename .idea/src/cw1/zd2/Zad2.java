package cw1.zd2;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        System.out.println(arr[0]  + " " + arr[1] + " " + arr[2]);

        if(arr[0] > arr[1] && arr[0] > arr[2])
        {
            int tmp = arr[2];
            arr[2] = arr[0];
            arr[0] = tmp;
        }
        if(arr[1] > arr[0] && arr[1] > arr[2])
        {
            int tmp = arr[2];
            arr[2] = arr[1];
            arr[1] = tmp;
        }
        if(arr[0] > arr[1])
        {
            int tmp = arr[1];
            arr[1] = arr[0];
            arr[0] = tmp;
        }
        System.out.println(arr[0]  + " " + arr[1] + " " + arr[2]);
    }

}
