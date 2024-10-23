package task22oct24;

import java.util.Scanner;

public class VowelsAndConsonantsCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String to know the consonants and vowel sounds : ");
        String es = sc.nextLine();
        int l= es.length();
        int v=0;
        int c=0;
        for(int i=0;i<l;i++)
        {

            if (es.charAt(i)=='a'|| es.charAt(i)=='e'|| es.charAt(i)=='i'||es.charAt(i)=='o'||es.charAt(i)=='u')
                v++;
            else
                c++;

        }
        System.out.println("no of vowels : "+ v);
        System.out.println("no of consonants : "+ c);
        //Scanner.close();
    }

}
