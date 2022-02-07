package com.company;
import java.util.Scanner;

public class SortAscending {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");

        int[] a = new int[20];
        int i=0,j=0,n,temp;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n= obj.nextInt();
        System.out.print("\nEnter values:\n");
        for(i=0;i<n;i++)
            a[i]= obj.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print("\t"+a[i]);
    }
}
