package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,29,451,2,5,5},
                {45,5,4,7,451,41},
                {25,52,581,24,5},
                {58,69,87,5,45,75}
        } ;
        int target = 451;
        System.out.println(search(arr, target));

    }

    static int search(int[][] arr,int target){
        for(int r = 0; r < arr.length; r ++){
            for(int c =0; c< arr.length;c++){
                if(arr[r][c]== target){
                    return target;
                }
            }
        }
        return -1;
    }
}
