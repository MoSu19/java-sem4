package com.company;
import java.util.Scanner;

public class StudentMain {

    static void sort(Student[] a)
    {
        Student temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
                if(a[i].regno>a[j].regno)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }
    }

    public static void main(String[] arg)
    {
        int n;
        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        Student[] st=new Student[n];
        for(int i=0;i<n;i++)
        st[i].getData();

        sort(st);
        String target = sc.nextLine();

        for(int i=0;i<n;i++)
        {
            if(st[i].search(target))
                st[i].display();
        }
    }
}
