package practice_problems;

import java.util.Scanner;

public class NewFibonacci {
    public static void main(String[] args) {
        // 1 = 1
        // 2 = 1*2 =2
        // 3 = 1*2*3 = 6
        // 4 = 1*2*3*4 = 24
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = inp.nextInt();
        if (n == 1 ){
            System.out.println("factorial of "+ n + " is: "+ n);
        }
        int fac = 1;
        for (int i = 1; i<= n ; i++){
            fac *= i; // 5- 1 2 6
        }
        System.out.println("Factorial of "+ n + " is: " + fac );
    }
}
