/*
Write a java program to swap Two numbers.
 */

package javaBasics_1;

import java.util.Scanner;

public class Swap {
    public static void main(String args[])
    {
        int x,y,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x :");
        x=sc.nextInt();
        System.out.println("Enter value of y :");
        y=sc.nextInt();
        System.out.println("Before Swapping Values of x is : "+x+" and Value of y is : "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping Values of x is : "+x+" and Value of y is : "+y);


    }
}
