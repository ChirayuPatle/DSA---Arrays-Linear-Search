package practice_problems;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ReturnType {
    public ReturnType() {
    }

    public static void main(String[] args) {
        int sumValue = sum();
        System.out.println(sumValue);
        String value = stringGreeting("Chirayu");
        System.out.println(value);
        greeting();
    }

    static void greeting() {
        System.out.println("This is void  method");
    }

    static int sum() {
        int a = 2;
        int b = 2;
        int sum1 = a + b;
        return sum1;
    }

    static String stringGreeting(String name) {
        String msg = "hello " + name;
        return msg;
    }
}
