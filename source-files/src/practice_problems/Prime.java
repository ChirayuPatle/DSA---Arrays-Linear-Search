package practice_problems;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = inp.nextInt();
        if(n==1 || n==2){
            System.out.println("The number is prime number");
        }
        for (int i=2; i<n;i++){
            if (n%i == 0){
                System.out.println(n + " is not prime number");
                break;
            }
            else{
                System.out.println(n+ " is a prime number");
            }
        }
    }
}
