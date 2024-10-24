package task23;
import java.util.Scanner;

public class funexm {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x :");
        int x=sc.nextInt();
        System.out.println("Enter y :");
        int y =sc.nextInt();


        sum(x, y);
        difference(x, y);
        multiplication(x, y);
        division(x, y);
    }
    static void sum(int a,int b)
    {
        System.out.println("sum of two numbers = "+ (a+b));
    }
    static void difference(int a,int b)
    {
        int c;
        c=(a>b)?(a-b):(b-a);
        System.out.println("differcence of two numbers = "+c);
    }
    static void multiplication(int a,int b)
    {
        System.out.println("multiplication of two numbers ="+(a*b));
    }
    static void division(int a,int b)
    {
        float c;
                c=(a>b)?(a/b):(b/a);
        System.out.println("division of two numbers ="+c);
    }

}

