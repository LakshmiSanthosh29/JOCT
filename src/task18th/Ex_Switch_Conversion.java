package task18th;

import java.util.Scanner;

public class Ex_Switch_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 for km to miles...");
        System.out.println(" 2 for fahrenheit to celsius...");
        System.out.println("Enter your choice 1 or 2 : ");
        int ch=sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("Enter km : ");
                double km=sc.nextDouble();
                double miles=km * 0.621371;
                System.out.printf("%.2f km in miles = %.2f",km,miles);
                break;
            case 2:
                System.out.println("Enter fahrenheit : ");
                float f=sc.nextFloat();
                float c=(f-32)*5/9;
                System.out.printf("%f fahrenheit in celsius = %f",f,c);
                break;
            default:
                System.out.println("Invalid...Choose 1 or 2...");

        }

    }

}
