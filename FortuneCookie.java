package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class FortuneCookie {
    public static void main (String [] args) {
        Random randomizer = new Random();

        int x = randomizer.nextInt(6);

        switch (x) {
            case 0:
                System.out.println("Greg and Mary were meant to be together.");
                break;
            case 1:
                System.out.println("Danielle and Princeton were meant to be together.");
                break;
            case 2:
                System.out.println("Cedes and Anthony were meant to be together.");
                break;
            case 3:
                System.out.println("Jr and Nyla were meant to be together.");
                break;
            case 4:
                System.out.println("Mary and S.D. were meant to be together.");
                break;
            case 5:
                System.out.println("Shekal and E were meant to be together.");
                break;
            case 6:
                System.out.println("Kim and King were meant to be together.");
                break;
        }
        System.out.println("Thanks Randomizer");

    }
}
