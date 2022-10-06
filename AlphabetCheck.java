//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet:");
        Scanner Scanner = new Scanner(System.in);
        String alphabet = Scanner.next();
        switch (alphabet) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
