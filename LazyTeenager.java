package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String [] args) {
        int counter = 1;

        Random randomizer = new Random();
        int i = randomizer.nextInt(10) + 1;

        do {
            System.out.println("Go clean your room! (x" + counter + ")" );
            counter++;
            if (counter >= 7) {
                System.out.println("Go clean your room! (x" + counter + ")" );
                System.out.println("Clean your room! That's it. I'm doing it and I'm taking your XBox!");
                break;
            }
        } while (i >= counter);

        if (counter < 7) {
            System.out.println("Ok. I will clean my room!");
        }
    }
}
