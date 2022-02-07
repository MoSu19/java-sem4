package com.company;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PanCard {

    public static void main(String[] args)
    {

        System.out.print("Mohit Suhasaria\t19BCE2167\n");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String pan = sc.nextLine();

        int n=0;

        if(name==null && pan.length()!=10)
            throw new IllegalArgumentException();
        else
        {
            char ch;
            for(int i=0;i<pan.length();i++)
            {
                ch=pan.charAt(i);
                if(Character.isDigit(ch) || Character.isAlphabetic(ch))
                    continue;
                else
                    throw new NoSuchElementException();
            }

            for(int i=5;i<9;i++)
            {
                ch=pan.charAt(i);
                if(Character.isDigit(ch))
                    n++;
            }
            if(n==4 && pan.charAt(4)==name.charAt(0))
                System.out.print("\nValid");
            else
                System.out.print("\nInvalid");
        }
    }

}
