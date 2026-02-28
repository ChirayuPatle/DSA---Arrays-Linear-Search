package LinearSearch;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "chirayu";
        char target = 'i';
        System.out.println(search(name, target));

        // creating character array
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search(String str, char target){
//        if(str.length() == 0){
        if(str.isEmpty()){
            System.out.println("String is empty..");
            return false;
        }
//        for(int i = 0; i < str.length() ; i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
        for(char i : str.toCharArray()){
            return true;
        }
        return false;
    }
}
