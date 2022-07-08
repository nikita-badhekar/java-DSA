package basicJava_1;

import java.util.Scanner;

public class circle {

    public static void main(String args[]){
        double r,a,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius :");
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.println("Area of circle is :"+a);
        p=2*3.14*r;
        System.out.println("Perimeter of circle is :"+p);
    }

}
