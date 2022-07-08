/*
Enter the student marks and showing the grade
*/
package javaBasics_1;


import java.util.Scanner;

public class gradeStudent {
    public static void main(String args[])
    {
        int n,marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of The students :");
        n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter Marks. of The students :"+(i+1));
            marks = sc.nextInt();
            if (marks > 50) {
                System.out.println("First Class ");
            } else if (marks >= 35) {
                System.out.println("Second Class ");
            } else {
                System.out.println("Fail ");
            }
        }
    }
}
