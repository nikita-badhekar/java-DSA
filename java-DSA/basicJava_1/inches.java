/*
Write a program that reads a number in inches,convert it to meters ..
 */
package javaBasics_1;
import java.util.Scanner;
public class inches {
    public static void main(String args[])
    {
        double inch,meters;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter inches ");
        inch=sc.nextDouble();
        meters=inch*0.0254;
        System.out.println(inch + "inches = "+ meters+"Meters");
    }
}
