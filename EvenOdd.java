//Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner check=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=check.nextInt();
        if(number%2==0) {
            System.out.println("Number is Even " +number);
        } else {
            System.out.println("Number is Odd " +number);
        }
    }
}
