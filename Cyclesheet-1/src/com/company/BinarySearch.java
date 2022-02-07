package com.company;
import java.util.Scanner;

public class BinarySearch {

    int binarysearch(int[] arr,int val)
    {
        int start=0,end=arr.length-1,mid;
        while (end>=start)
        {
            mid = start+(end-start)/2;
            if(arr[mid]==val)
                return mid;
            else if (arr[mid]<val)
                start=mid+1;
            else
                end=mid-1;

        }

        return (-1);
    }

    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");

        int[] a = new int[20];
        int i=0,j=0,n,temp,k;
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
            System.out.print(a[i]+"\t");
        System.out.print("\nEnter value to search for: ");
        k = obj.nextInt();
        BinarySearch bs=new BinarySearch();
        System.out.print(bs.binarysearch(a,k));

    }
}
