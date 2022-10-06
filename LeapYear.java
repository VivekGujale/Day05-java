//Leap Year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a leap Year");
        }
    }
}