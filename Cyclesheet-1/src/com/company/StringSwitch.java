package com.company;
import java.lang.*;
import java.util.Scanner;
public class StringSwitch {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = obj.nextLine();
        String fin=new String();
        int index;
        System.out.print("\n1. Append\t2. Insert\t3.Delete\n");
        n= obj.nextInt();
        switch (n)
        {
            case 1:
                String flsh= obj.nextLine();
                System.out.print("\nEnter second string: ");
                String temp= obj.nextLine();
                fin=s.concat(temp);
                break;
            case 2:
                flsh= obj.nextLine();
                System.out.print("\nEnter second string: ");
                temp= obj.nextLine();
                System.out.print("\nEnter index: ");
                index=obj.nextInt();
                for(int i=0;i<s.length();i++)
                {
                    fin+=s.charAt(i);
                    if(i==index)
                        fin+=temp;
                }
                break;
            case 3:
                flsh= obj.nextLine();
                System.out.print("\nEnter second string: ");
                temp= obj.nextLine();
                fin=s.replaceAll(temp,"");
                break;
        }
        System.out.print("\n"+fin);
    }
}
