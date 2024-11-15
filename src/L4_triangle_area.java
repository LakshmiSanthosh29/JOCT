import java.util.Scanner;

public class L4_triangle_area
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Triangle : ");
        int length=sc.nextInt();
        System.out.println("Enter Breadth of the Triangle : ");
        int breadth = sc.nextInt();
        area(length,breadth);
    }
    static void area(int l,int b)
    {
        System.out.println("Area of the Traingle : "+ (l*b));
    }
}
