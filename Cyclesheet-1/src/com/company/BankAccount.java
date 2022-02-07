package com.company;
import java.util.Scanner;

abstract class BankAccount {
    String name, dob, address;
    long acc_no;
    int balance;
    public abstract String get();
    public abstract void deposit();
    public abstract void withdraw();

}

class SavingsAccount extends BankAccount{
    public String get(){
        System.out.print("\n\nBank Database\n\n");
        return ("\nName: "+name+"\tDoB: "+dob+
                "\nAccount Number: "+acc_no+"\tBalance: "+balance
                +"\nAddress: "+address);
    }
    SavingsAccount(String x,String y,long z,String k,int a){
        super.name=x;
        super.dob=y;
        super.acc_no=z;
        super.address=k;
        super.balance=a;
    }
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        int money= sc.nextInt();
        super.balance-=money;
    }
    public void deposit(){
        Scanner sc=new Scanner(System.in);
        int money= sc.nextInt();
        super.balance+=money;
    }
}

class Bank{
    public static void main(String[] arg) {
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner sc = new Scanner(System.in);
        String name,address,dob;
        int choice,total = 1, flag = 0,amount;
        long num=3800,acc,del;
        String flush;
        BankAccount[] obj = new SavingsAccount[100];
        while (flag == 0) {
            System.out.print("\n\n1.Create Account\n2.Delete Account\n3.Withdraw" +
                    "\n4.Deposit\n5.Exit Menu\n");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    flush=sc.nextLine();
                    System.out.print("\nName: ");
                    name=sc.nextLine();

                    System.out.print("\nDob: ");
                    dob=sc.nextLine();

                    System.out.print("\nAddress: ");
                    address=sc.nextLine();

                    acc=num;
                    System.out.print("\nNew Account Number: "+acc);

                    amount=0;
                    obj[total-1]=new SavingsAccount(name,dob,acc,address,amount);

                    total++;
                    num++;
                    break;
                case 2:
                    System.out.print("\nEnter Account number: ");
                    del= sc.nextLong();
                    for (int i=0;i<total;i++)
                    {
                        if(obj[i].acc_no==del)
                        {
                            for (int j=i;j<total-1;j++)
                                obj[j]=obj[j+1];
                            obj[total-1]=null;
                            total--;
                            del=0;
                            break;
                        }
                    }
                    if(del==0)
                        System.out.print("\nAccount Deleted Successfully");
                    else
                        System.out.print("\nAccount not Found");
                    break;
                case 3:
                    System.out.print("\nEnter Account number: ");
                    del= sc.nextLong();
                    for (int i=0;i<total;i++)
                    {
                        if(obj[i].acc_no==del)
                        {
                            System.out.print("\nAccount found.\nEnter amount: ");
                            obj[i].withdraw();
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nEnter Account number: ");
                    del= sc.nextLong();
                    for (int i=0;i<total;i++)
                    {
                        if(obj[i].acc_no==del)
                        {
                            System.out.print("\nAccount found.\nEnter amount: ");
                            obj[i].deposit();
                        }
                    }
                    break;
                case 5:
                    flag=1;
                    break;
            }
        }
        for (int i=0;i<total;i++)
            obj[i].get();
    }
}