package task29th;

import java.util.Scanner;

public class fin_dup_arr_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];
        System.out.println("Enter the Array values : ");

        for (int i = 0; i < arr_size; i++)
        {
            System.out.println("Enter Array "+ i);
            arr[i] = sc.nextInt();
        }
        duplicate(arr);

    }

   static void duplicate(int[] arr)
    {
        int d=arr[0];
        int j=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(d==arr[i])
              j++;
            else
                d=arr[i];
        }
        boolean ans;
        if(j>=1) {
            ans = true;
            System.out.println("yes! This Array has duplicate values");
        }
        else {
            ans = false;
            System.out.println("No! This Array has no duplicate values");
        }

    }
}
