package ArraysExamples;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrays {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        // take size of array
        System.out.print("Enter size of array: ");
        int n = inp.nextInt();

        // initialize array
        int[] arr = new int[n];

        // take input
        System.out.print("Enter elements of array: ");
        for(int i=0; i< n;i++){
            arr[i] = inp.nextInt();
        }

        //another method- it is converted to string and then printed as array(in built method)
        System.out.println(Arrays.toString(arr));

        // provide output
//        for (int i=0; i< n ;i++){
//            System.out.print("["+arr[i] + "]");
//        }

        // for each loop
//        System.out.println("Array elements are: ");
//        for(int i: arr){
//            System.out.print(i);
//        }



        inp.close();

    }
}
