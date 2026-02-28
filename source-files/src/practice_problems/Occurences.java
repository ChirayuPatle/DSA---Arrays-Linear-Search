package practice_problems;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Occurences {
    public Occurences() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.print("Enter number to count: ");

        for(int inp = sc.nextInt(); n > 0; n /= 10) {
            int reminder = n % 10;
            if (reminder == inp) {
                ++count;
            }
        }

        System.out.println("repetation occured: " + count);
        sc.close();
    }
}
