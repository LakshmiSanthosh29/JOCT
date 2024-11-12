package task16th;

import java.util.Scanner;

public class INput_UsingScannerExm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age : ");
        int age= sc.nextInt();
        System.out.println("Enter your Salary : ");
        double salary=sc.nextDouble();
        System.out.println("NAME : "+name + '\n' + "AGE : "+ age + '\n' + "SALARY : "+ salary);

    }
}
