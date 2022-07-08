//write a java program that takes two numbers as input and display the product of two numbers :
package javaBasics_1;
import java.util.Scanner;
public class Pr_1 {
    public static void main(String args[])
    {
        int a=10,b=4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        a=sc.nextInt();
        System.out.println("Enter b : ");
        b=sc.nextInt();
        b*=a;
        System.out.println("Product is "+b);
    }
}
