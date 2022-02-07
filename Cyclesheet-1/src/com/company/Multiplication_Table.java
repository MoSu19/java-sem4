package com.company;
import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        System.out.print("Enter number: ");
        Scanner obj = new Scanner(System.in);
        int k = obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print("\n"+k+" * "+i+" = "+k*i);
        }
    }
}
