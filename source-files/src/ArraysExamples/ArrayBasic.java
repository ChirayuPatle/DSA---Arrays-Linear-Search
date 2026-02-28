package ArraysExamples;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // array object
//        int[] arr= new int[4];
//        for(int i=0;i<4;i++){
//            System.out.print("Enter elements of array:");
//            arr[i] = sc.nextInt(); // store input into array refrence object
//        }
//        System.out.print("Array elements are: ");
//        for(int j=0;j<4;j++){
//            System.out.print(arr[j]);
//        }

        // array literal
        int[] a2= {1,2,3,4,5};
        System.out.println("Length: "+a2.length);
        System.out.print("Array elements are: ");
        System.out.print("[ ");
        for (int i=0;i< a2.length ;i++){
            System.out.print(a2[i]);
            System.out.print(" ");
        }
        System.out.println("]");

//        int[] array = new int[]{1,2,3,4,5};
//        for (int elements : array){ //  note : element takes value from 1,2,3... but when we array use index from 0 so first value will be ignored
//            System.out.print(elements);
//        }

        // datatype[] variable_name = new datatype[size];

    }
}
