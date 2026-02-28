package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10,15,46,26,4854,8,415,45,2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int num = arr[0];

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < num){
                num  = arr[i];
            }
        }
        return num;
    }
}
