package com.company;
import java.util.Scanner;

public class Student {
    int regno;
    String name;
    String programme;
    float cgpa;

    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nName: ");
        name= sc.nextLine();
        System.out.print("\nRegNo: ");
        regno= sc.nextInt();
        System.out.print("\nProgramme: ");
        programme= sc.nextLine();
        System.out.print("\nCGPA: ");
        cgpa= sc.nextFloat();
    }
    boolean search(String s)
    {
        if(s.equals(regno))
            return true;
        else
            return false;
    }
    void display()
    {
        System.out.print("\nName: "+name);
        System.out.print("\nRegNo: "+regno);
        System.out.print("\nProgramme: "+programme);
        System.out.print("\nCGPA: "+cgpa);
    }

}
