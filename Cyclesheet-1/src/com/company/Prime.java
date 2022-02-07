package com.company;
import java.util.Scanner;

public class Prime {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");

        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int flag=0;
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                flag=1;
                System.out.print("\nNot Prime");
                break;
            }
        }
        if(flag==0)
            System.out.print("\nIs Prime");

    }
}
