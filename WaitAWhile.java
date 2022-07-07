package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String [] args){
        int timeNow = 6; //If the timeNow is 11, the while loop will not run
        int bedTime = 10; // If this is changed, the while loop will run less or more

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + "o'clock");
            System.out.println("I think I'll stay up just a liiiiitle longer ...");
            timeNow++; //If this  is commented, the loop will keep running
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
