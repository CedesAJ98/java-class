package com.sg.foundations.flowcontrol.whiles;

public class LovesMe {
    public static void main (String [] args){

        int i = 0;

        while (i < 34) {
            System.out.println("It loves me NOT!");
            i++;
            System.out.println("It loves me!");
            i++;
        }

        //I used while loop because it is not important for the loop to run at least one but 34 times

        System.out.println("Okay. You've had " + i + " petals. It loves you!!");
    }
}
