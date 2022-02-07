package com.company;

public class FloatValues implements Operations{
    private float a;
    private float b;

    public FloatValues(float a, float b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println("The addition of float " + a + " and " + b + " is " + (a+b));
    }
    public void subtract(){
        System.out.println("The subtraction of float " + a + " and " + b + " is " + (a-b));
    }
    public void multiply(){
        System.out.println("The multiplication of float " + a + " and " + b + " is " + (a*b));
    }
    public void divide(){
        System.out.println("The division of float " + a + " and " + b + " is " + (a/b));
    }
}

