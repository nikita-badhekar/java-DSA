package javaBasics_1;
import java.util.Scanner;
public class userIput
{
    public static void main(String args[])
    {
        int age;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name :");
        name=sc.nextLine();
        System.out.println("Enter Age :");
        age=sc.nextInt();
    }
}
