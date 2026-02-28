package ArraysExamples;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] nums= {1,2,3,10};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
         arr[0] =100;
    }
}
