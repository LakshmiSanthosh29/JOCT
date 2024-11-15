import java.util.Scanner;

public class L4_stu_bio
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student name : ");
        String stu_name=sc.next();
        System.out.println("Enter StudentId : ");
        int stu_Id=sc.nextInt();
        System.out.println("Enter Student Age : ");
        int stu_Age=sc.nextInt();
        System.out.println("Enter Student Fee : ");
        float stu_fee=sc.nextFloat();
        //System.out.println("Enter Student Grade : ");
       // char stu_Grade=sc.next().charAt();
        System.out.println("STUDENT DETAILS : ");
        System.out.println("NAME :"+stu_name+ '\n'+"ID : "+stu_Id+'\n'+"Age :"+stu_Age+'\n'+"fee :"+stu_fee);
    }
}
