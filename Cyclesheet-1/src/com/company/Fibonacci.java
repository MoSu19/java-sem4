package com.company;

public class Fibonacci {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        int i=0,temp1=1,temp2=0;
        while(i<100)
        {
            i=temp1+temp2;
            System.out.print("\t"+i);
            temp1=temp2;
            temp2=i;
        }
    }
}
