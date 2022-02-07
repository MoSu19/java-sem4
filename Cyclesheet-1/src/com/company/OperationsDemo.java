package com.company;

public class OperationsDemo {
    public static void main(String args[]){

        System.out.print("Mohit Suhasaria\t19BCE2167\n");
        FloatValues floatOperations = new FloatValues(4.4f, 2.4f);
        IntegerValues intOperations = new IntegerValues(6,7);

        System.out.println("Operations on floating point numbers:");
        floatOperations.add();
        floatOperations.subtract();
        floatOperations.multiply();
        floatOperations.divide();

        System.out.println("\nOperations on integer numbers:");
        intOperations.add();
        intOperations.subtract();
        intOperations.multiply();
        intOperations.divide();
    }
}
