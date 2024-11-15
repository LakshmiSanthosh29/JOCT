import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.io.IOException;


public class L5_tot_cost
{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the Item: ");
        String item_name=sc.next();
        System.out.println("Enter no of items : ");
        int num=sc.nextInt();
        System.out.println("Enter price for each Item: ");
        float price=sc.nextFloat();
        float tot_price=price(num,price);
        //System.out.println("Enter the currency : ");
        char curren='$';
        //BufferedReader reade =new BufferedReader(new InputStreamReader(System.in));
        //char curren = (char)reade.read();
        System.out.printf("TOTAL PRICE OF %d %s = ",num,item_name);
        System.out.println(tot_price + curren);
        //System.out.print(curr);
    }

    static float price(int num, float price)
    {
        return num*price;
    }
}
