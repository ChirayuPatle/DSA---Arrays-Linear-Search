package practice_problems;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Fibonacci {
    public Fibonacci() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter term: ");
        int num = inp.nextInt();
        int a = 0;
        int b = 1;

        for(int count = 2; count <= num; ++count) {
            int temp = b;
            b += a;
            a = temp;
        }

        System.out.println(b);
        inp.close();
    }
}
