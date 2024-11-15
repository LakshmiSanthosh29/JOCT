import java.util.Scanner;

public class L7_TypeCasting
{
    public static void main(String[] args) {
        int max_score=500;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Score : ");
        int score=sc.nextInt();
        float percentage=(float) score/max_score * 100;
        System.out.println("Your Percentage is : "+percentage);


   // Scanner.close();
    }

}
