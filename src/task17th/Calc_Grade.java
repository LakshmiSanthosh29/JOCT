package task17th;

import java.util.Scanner;

public class Calc_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Grade : ");
        int score=sc.nextInt();
        if(score>=90 && score<=100)
            System.out.println("You got Grade : A");
        else if(score>=80 && score<90)
            System.out.println("You got Grade : B");
        else if(score>=70 && score<80)
            System.out.println("You got Grade : C");
        else if(score>=35 && score<70)
            System.out.println("you got Grade : D");
        else
            System.out.println("You got Failed");

        sc.close();
    }
}
