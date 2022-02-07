package com.company;
import java.lang.*;
import java.util.Scanner;
public class StringSwitch2 {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = obj.nextLine();
        String fin=new String();
        int index;
        System.out.print("\n1.Compare two strings\n2.Get the character in the specified position\n" +
                "3.Extract a substring\n4.Replace a character with the given character\n" +
                "5.Get the position of a specified substring/character\n");
        n= obj.nextInt();
        switch (n)
        {
            case 1:
                String flsh= obj.nextLine();
                System.out.print("\nEnter second string: ");
                String temp= obj.nextLine();
                System.out.print("\n"+s.compareTo(temp));
                break;
            case 2:
                flsh= obj.nextLine();
                System.out.print("\nEnter index: ");
                index=obj.nextInt();
                System.out.print("\nCharacter at "+index+" is: "+s.charAt(index));
                break;
            case 3:
                flsh= obj.nextLine();
                System.out.print("\nEnter the indices: ");
                int start= obj.nextInt();
                int end= obj.nextInt();
                fin=s.substring(start,end);
                System.out.print("\n"+fin);
                break;
            case 4:
                flsh= obj.nextLine();
                System.out.print("\nEnter character to replace then character to be replaced by: ");
                String old=obj.nextLine();
                String nw=obj.nextLine();
                fin=s.replaceAll(old,nw);
                System.out.print("\n"+fin);
                break;
            case 5:
                flsh= obj.nextLine();
                System.out.print("\nEnter substring/character: ");
                temp= obj.nextLine();
                System.out.print("\n"+s.indexOf(temp));
                break;


        }
    }
}
