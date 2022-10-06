//Harmonic Number

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        double i,n = 6;
        double sum = 0;
        for ( i = 1; i < n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("Harmonic value =" + sum);
    }
}

        /*double i, n, sum = 0;
        System.out.println("Enter the value of n = ");
        Scanner check = new Scanner(System.in);
        n = check.nextDouble();
        for (i = 1; i <= n; i++) {
            sum=sum+1/i;
            if (i == 1) {
                System.out.println("1 +");
            } else if (i == n) {
                System.out.println("1/ " + i);
            } else {
                System.out.println("1 / " + i + "&nbsp; +&nbsp; ");
            }
            System.out.println();
            System.out.println("Sum of harmonic series is : " + sum);
        }
    }
         */
