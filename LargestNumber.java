//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers : ");
        Scanner check = new Scanner(System.in);
        int a = check.nextInt();
        int b = check.nextInt();
        int c = check.nextInt();
        if (a > b && a > c) {
            System.out.println("a is largest Number : " + a);
        } else if (b > a && b > c) {
            System.out.println("b is largest Number : " + b);
        } else {
            System.out.println("c is largest Number : " + c);
        }
    }
}
