package com.company;
import java.util.Scanner;

public class Item {
    String[] item_name=new String[20];
    int[] price=new int[20];
    int[] quantity=new int[20];
    int total_price=0;
    int n=0;

    void setbill()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter total no. of items: ");
        n=s.nextInt();
        String flsh=new String();
        //flsh=s.nextLine();
        int i=0;
        while(i<n)
        {
           flsh=s.nextLine();
            System.out.print("\nItem name: ");
            item_name[i]=s.nextLine();
           // flsh=s.nextLine();
            System.out.print("\nPrice: ");
            price[i]=s.nextInt();
          //  flsh=s.nextLine();
            System.out.print("\nQuantity: ");
            quantity[i]=s.nextInt();
            i++;
        }
    }
    void getbill()
    {
        int i=0;
        while(i<n)
        {
            System.out.print("\n"+(i+1)+".\t"+item_name[i]+"\tRs."+price[i]+"\t"+quantity[i]+"\n");
            total_price+=(price[i]*quantity[i]);
            i++;
        }
        System.out.print("\n\t\t\tTotal Bill: "+total_price);
    }

}
