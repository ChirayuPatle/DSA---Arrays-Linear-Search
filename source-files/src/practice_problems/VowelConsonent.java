package practice_problems;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); // convert to lowercase for simplicity

        // Check using switch
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                // Check if input is an alphabet
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println("Invalid input! Please enter an alphabet.");
                }
        }

    }
}
