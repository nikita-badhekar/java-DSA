/*
Take three number from the user and print the greatest number
 */
package javaBasics_1;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String args[])
    {
        int a,b,c,temp,largest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b :");
        b=sc.nextInt();
        System.out.println("Enter c :");
        c=sc.nextInt();
        if(b<a && c<a)
        {
            System.out.println("a: "+a+"is Greater");

        }else if(a<b && c<b)
        {
            System.out.println("b: "+b+"is Greater");
        }
        else
        {
            System.out.println("c: "+c+"is Greater ");
        }

    }
}
