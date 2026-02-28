package practice_problems;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Swap {
    public Swap() {
    }

    public static void main(String[] args) {
        String name = name1("Chirayu");
        System.out.println("name is: " + name);
        name = changeName("Kunal");
        System.out.println("name is: " + name);
        swap(12, 20);
    }

    static String changeName(String naam) {
        return naam;
    }

    static String name1(String name) {
        return name;
    }

    static void swap(int n1, int n2) {
        System.out.println("value of a: " + n2 + " & value of b : " + n1);
    }
}
