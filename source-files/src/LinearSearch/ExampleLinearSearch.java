package LinearSearch;
import java.util.Scanner;

public class ExampleLinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter element to be searched: ");
        int num = in.nextInt();
        program(arr, num);
    }

    static void program(int[] arr, int num) {
        if (arr.length == 0) {
            System.out.println("Array is empty..");
        } else {
            if (arr[0] == num) {
                System.out.println("Element found at index: 0");
                return;
            }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num) {
                        System.out.println("Element found at index: " + i);
                        return;
                    }
                }
            System.out.println("Element not found..");
        }
    }
}
