package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class ForTimes {
    public static void main (String [] args){

        Scanner tt = new Scanner(System.in);

        System.out.println("Enter a number ");
        int timeTables = tt.nextInt();
        System.out.println("Here are the times tables for " + timeTables);

        for( int i = 1; i < 16; i++) {
            System.out.println(timeTables + " * " + i + " is " + i * timeTables);
        }

    }
}
