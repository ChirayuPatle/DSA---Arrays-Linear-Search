package practice_problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = inp.nextInt();
        System.out.println("Original sequence: "+ n);
        for(int i = n ; i >= 0; i--){
            System.out.println("Reverse is: "+ n);
        }
    }
}
