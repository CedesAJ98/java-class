package com.sg.foundations.flowcontrol.arrays;
import java.util.Random;

public class HiddenNuts {
    public static void main(String [] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "new";
        System.out.println("The nut has been hidden...");

        for(int i = 0; i < 100; i++) {
            if (hidingSpots[i] == "new") {
                System.out.println("Found it! It's in spot #" + i + ".");
            }
        }
    }
}
