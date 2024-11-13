package task18th;

import java.util.Scanner;

public class Calc_Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter NUmber1 : ");
        int x=sc.nextInt();
        System.out.println("Enter NUmber2 : ");
        int y=sc.nextInt();
        System.out.println("Enter Operator to perform : ");
        char op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.printf("SUM OF TWO GIVEN NUMBERS = %d",(x+y));
                break;
            case '-':
                System.out.printf("DIFFERENCE BETWEEN TWO NUMBERS = %d",(x-y));
                break;
            case '*':
                System.out.printf("MULTIPLICATION OF TWO GIVEN NUMBERS = %d",(x*y));
                break;
            case '/':
                System.out.printf("DIVISION OF TWO GIVEN NUMBERS = %d",(x/y));
                break;
            case'%':
                System.out.printf("MODULOUS OF TWO GIVEN NUMBERS = %d",(x%y));
                break;
            default:
                System.out.println("ENTERED INVALID OPERATOR...");
                break;
        }
        sc.close();
    }
}
