package task22oct24;
import java.util.Scanner;

public class freverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number to reverse: ");
        int number= sc.nextInt();
        int rnumber=0;

        for(; number!=0;number/=10){

            int digit =number%10;
            rnumber= rnumber * 10 + digit;

        }
        System.out.println("reverse number = " + rnumber);
    }
}
