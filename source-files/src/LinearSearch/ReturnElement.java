package LinearSearch;
import java.util.Scanner;

public class ReturnElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element: ");
        int num = in.nextInt();
        System.out.println(program(arr, num));
    }
    static int program(int[] arr, int num){
        for(int i : arr){
            if(i ==  num){
                return i;
            }
        }
        return -1;
//        return Integer_MAX_VALUE;
    }
}
