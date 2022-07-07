package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(50) + 51 + ", "); //don't see a difference if change from 101 to 50 + 51
        System.out.print(randomizer.nextLong(101) + ", "); // long - 29
        System.out.print(randomizer.nextDouble(101) + ", "); //double - 56.18406172209395
        System.out.println(randomizer.nextFloat(101)); //float - 78.649216
        System.out.println(randomizer.nextInt(101) > 101); // can include random numbers in math statements
    }
}