//Power of 2

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int  power=1;
        System.out.println("Enter the number :");
        Scanner n=new Scanner(System.in);
        int value=n.nextInt();
        for (int a = 1; a <=value; a++) {
            power = 2 * power;
        }
        System.out.println("Power of 2 is " + power);
    }
}
