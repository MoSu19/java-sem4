package com.company;

public class Pattern2 {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        int sp=2;
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            sp--;
            System.out.print("\n");
        }
        sp=1;
        for(int i=2;i>0;i--)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            sp++;
            System.out.print("\n");
        }
    }
}
