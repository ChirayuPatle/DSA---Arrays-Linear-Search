package ArraysExamples;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Largest number: " + largest(arr));
    }
    static int largest(int[] arr){
        int num = arr[0];
        for(int i : arr){
            if(i > num) {
             num = i;
            }
        }
        return num;
    }
}
