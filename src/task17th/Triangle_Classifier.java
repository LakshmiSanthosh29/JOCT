package task17th;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of Triangle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c)
            System.out.println("Given is an Equilateral Triangle ");
        else if (a==b || b==c || c==a)
            System.out.println("Given is an Isosceless Triangle ");
        else
            System.out.println("Given is a scalene Triangle");
    }

}
