package task22oct24;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String word=sc.nextLine();
        boolean p=false;

        int j=word.length()-1;
        for(int i=0;i<j;i++,j--)
        {
           if(word.charAt(i)==word.charAt(j))
                          p = true;

           else
                          break;

        }
        if(p)
            System.out.println("yes!The given word is Pallindrome");
        else
            System.out.println("No! The given word is not Pallindrome");


    }
}
