package com.company;
import java.util.Scanner;

public class DecBinOctHex {
    public static void main(String arg[])
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");

        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt();
        System.out.print("\nBinary: "+Integer.toBinaryString(n));
        System.out.print("\nOctal: "+Integer.toOctalString(n));
        System.out.print("\nHexadecimal: "+Integer.toHexString(n));
    }
}
