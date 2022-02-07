package com.company;
import java.util.Scanner;
public class CaseChange {
    public static void main(String[] arg)
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner obj=new Scanner(System.in);
        String s= obj.nextLine();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isUpperCase(c[i]))
                c[i]=Character.toLowerCase(c[i]);
            else
                c[i]=Character.toUpperCase(c[i]);
        }
        s=new String(c);
        System.out.print("\n"+s);
    }
}
