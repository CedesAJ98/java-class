package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;

public class StayPositive {
    public static void main (String [] args) {


        for (int i = 100; i > 0; i--) {
            for (int j = 100; j > 0; j--) {
                System.out.print (i);
                System.out.print (" ");
                i--;
            }
            System.out.println("");
        }

        System.out.println("\nBlast off!!!!");
    }
}
