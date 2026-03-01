package LinearSearch;

public class EventDigitCount {
    public static void main(String[] args) {
       int[] arr = {10,15,5,0,155,1535};
        System.out.println(findevencount(arr));
    }

    private static int findevencount(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for(int i : arr){
            if(checkeven(i)){
                count++;
            }
        }
        return count;
    }


    // num of digits -> check whether even count or not
//    static boolean checkeven(int num){
//        int getnumber = noofdigits(num);
//        if(getnumber % 2 == 0){
//            return true;
//        }
//        return false;
//    }

    static boolean checkeven(int num){
        int digits = noofdigits(num);
        return (digits % 2 == 0) ;
    }

    static int noofdigits(int num){
        int n =0;
        if(num == 0){
            return -1;
        }
        while(num > 0){ // 9972 -> 997 (1) -> 99(2) -> 9(3) -> 0(4)
            n++;
            num = num / 10;
        }
//        System.out.println("valve of n"+n);
        return n;
    }
}

