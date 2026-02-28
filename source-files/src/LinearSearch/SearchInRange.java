package LinearSearch;
import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10,20,15,63,42,45,52}; // range elements: 20,15,63,42
        int start= 1;
        int end= 4;
        int target = 15;
        System.out.println(search(arr, start, end, target));
    }
    static int search(int[] arr, int start, int end, int target){
        // check existence of array
        if(arr.length == 0){
            System.out.println("Array is empty..");
        }

        // check cases

        for(int i = start ; i <= end; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return target;
            }
        }
        return -1;
    }
}
