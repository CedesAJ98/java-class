package com.sg.foundations.variables;

public class BestAdderEver {
    public static void main (String [] args){
        int myInt = 10;
        double myDouble = 50.35;
        float myFloat = 99.99f;

        double adder = myInt + myDouble + myFloat;

        System.out.print(myInt + " + " + myDouble + " + " + myFloat + " = " + adder);

    }
}
