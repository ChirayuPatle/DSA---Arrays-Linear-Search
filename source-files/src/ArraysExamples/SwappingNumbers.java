package ArraysExamples;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr, 1,3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int x, int y){
        int temp= arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter array elements: ");
//        for(int i : arr){
//            int a = in.nextInt();
//        }
//        int temp = ;
//        in.close();
    }
}
