//Java Program to Swap Two Numbers

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x & y");
        x=sc.nextInt();
        y=sc.nextInt();
        //for swapping
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping: "+x+","+y+"");
    }
}
