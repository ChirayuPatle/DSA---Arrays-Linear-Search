package ArraysExamples;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println("Reverse of array: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        for (int i= 5 ; i > 0; i--){
            System.out.println(i);
        }
    }
}
