//Prime factorization of N using brute force.

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the number n :");
        int n = check.nextInt();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println("" + i);
                n = n / i;
            }
        }
        //To find biggest factor
        if (n > 1) {
            System.out.println("" + n);
        } else {
            System.out.println();
        }
    }
}