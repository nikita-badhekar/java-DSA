/*
Write a java program to check whether the year is leap or not ...
*/
package javaBasics_1;
import java.util.Scanner;
public class leap_yr {
    public static void main(String args[])
    {
        int yr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year :");
        yr=sc.nextInt();
        if((yr%4==0)||(yr %400==0)||(yr%100==0))
        {
            System.out.println("is Leap Year ....");
        }
        else
        {
            System.out.println("is Not Leap Year ....");
        }
    }
}
