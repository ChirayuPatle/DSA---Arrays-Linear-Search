package practice_problems;

public class VariableArguments {
    public VariableArguments() {
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for(int i = 1; i <= 5; ++i) {
            System.out.println("i = " + i);
        }

        single(1,2,3,4,5,6);
    }

//    static void multiple(int a, int b, int... n){
//      // this is also possible
//    }
    static void single(int... a){
        for (int i : a){
            System.out.println(a);
        }
    }

}
