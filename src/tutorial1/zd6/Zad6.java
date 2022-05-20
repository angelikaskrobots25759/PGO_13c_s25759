package tutorial1.zd6;

public class Zad6 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = (int) ((Math.random() * 900)+100);
        }
        System.out.print("Generated array: ");
        printArr(arr);
        System.out.println();
        System.out.print("Sorted array: ");
        printArr(sort(arr));
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i != arr.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    public static int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int max = 1001;
        int index = 0;
        for(int i=0;i<result.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (max > arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = 1001;
            result[i] = max;
            max = 1001;
            index = 0;
        }
        return result;
    }
}

