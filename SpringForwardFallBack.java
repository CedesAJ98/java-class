package com.sg.foundations.flowcontrol.fors;

public class SpringForwardFallBack {
    public static void main(String[] args) {
        System.out.println("It's Spring...!");
        for (int i = 0; i < 10; i++) {  // the start point is 0 , end point is 9
            System.out.println(i + " , ");
        }

        System.out.println("\nOh no, it's fall...");
        for ( int i = 10; i > 0; i--) { // the start point is 10 , end point is 1
            System.out.println(i + " , ");
        }

        // first option - change the spring for loop (int i = 1; i < 11; i++)
        // second option - change the fall for loop (int i = 9; i >= 0; i--)
    }
}
