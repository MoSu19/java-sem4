package com.company;
import java.util.Scanner;

public class StringMethods {
    int wordCount(String str)
    {
        int count=1;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ')
                count++;
        return count;
    }
    String arrayToString(char[] ch)
    {
        String str=new String(ch);
        return str;
    }
    char mostFrequent(String str)
    {
        int max=0,count;
        char maxchar='e';
        for(int i=0;i<str.length();i++)
        {
            count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }
            if(count>max)
            {
                max=count;
                maxchar=str.charAt(i);
            }
        }
        return maxchar;
    }

    public static void main(String[] arg)
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner obj=new Scanner(System.in);
        StringMethods sm=new StringMethods();
        String s1= obj.nextLine();
        System.out.print(sm.wordCount(s1)+"\n");
        char[] x=obj.next().toCharArray();
        System.out.print(sm.arrayToString(x)+"\n");
        String flsh= obj.nextLine();
        String s2= obj.nextLine();
        System.out.print(sm.mostFrequent(s2));
    }
}
