package com.company;
import java.util.Scanner;

public class Telephone {
    String name;
    String phone;
}

class TelephoneIndex extends Telephone{
    TelephoneIndex(String x,String y)
    {
        name=x;
        phone=y;
    }
    void change_name()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter new name: ");
        name = sc.nextLine();
    }
    void change_number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter new number: ");
        phone = sc.nextLine();
    }

    String Get()
    {
        return (name+"\t"+phone+"\n");
    }
}

class TelephoneMain {
    public static void main(String[] arg)
    {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner s=new Scanner(System.in);
        TelephoneIndex[] ti=new TelephoneIndex[5];
        int i;
        for (i=0;i<5;i++)
        {
            System.out.print("\nName: ");
            String x= s.nextLine();
            System.out.print("\nNumber: ");
            String y=s.nextLine();
            ti[i]=new TelephoneIndex(x,y);
        }
        String find,flsh;
        flsh=s.nextLine();
        find= s.nextLine();
        for (i=0;i<5;i++)
            if (ti[i].Get().startsWith(find))
                System.out.print("\n"+ti[i].Get());
        int index=s.nextInt();
        flsh=s.nextLine();
        ti[index].change_name();
        ti[index].change_number();
        for (i=0;i<5;i++)
        System.out.print("\n"+ti[i].Get());
    }
}