package com.company;

public class IntegerValues implements Operations{
    private int a;
    private int b;

    public IntegerValues(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println("The addition of int " + a + " and " + b + " is " + (a+b));
    }
    public void subtract(){
        System.out.println("The subtraction of int " + a + " and " + b + " is " + (a-b));
    }
    public void multiply(){
        System.out.println("The multiplication of int " + a + " and " + b + " is " + (a*b));
    }
    public void divide(){
        System.out.println("The division of int " + a + " and " + b + " is " + (a/b));
    }
}

