package com.company;
import java.util.Scanner;

public class SumAvg {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        int[] a=new int[20];
        int n,i,sum=0,avg;
        System.out.print("Size of Array: ");
        Scanner obj= new Scanner(System.in);
        n= obj.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]= obj.nextInt();
            sum+=a[i];
        }
        System.out.print("\nSum: "+sum);
        avg=sum/n;
        System.out.print("\nAverage: "+avg);
    }
}
