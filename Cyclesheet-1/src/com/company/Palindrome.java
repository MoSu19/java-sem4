package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] arg)
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter String: ");
        String s= obj.nextLine();
        int end=s.length()-1;
        int start=0,flag=0;
        while(end>=start)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.print("\nNot");
        else
            System.out.print("\nIs Palindrome");
    }
}
