package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {
    public static void main (String [] args){

        Random randomizer = new Random();
        int myNum = randomizer.nextInt(101);

        int pickNum;
        String stringPickNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number from -100 to 100");
        stringPickNum = sc.nextLine();
        pickNum = Integer.parseInt(stringPickNum);

        if (pickNum != myNum){
            if (pickNum > myNum) {
                System.out.println("You picked " + pickNum + ". Too high. My number is " + myNum);
                System.out.println("Try again. Pick a number from -100 to 100.");
            } else if (pickNum < myNum) {
                System.out.println("You picked " + pickNum + ". My number is " + myNum + ". Your number is too low.");
                System.out.println("Try again. Pick a number from -100 to 100.");
            }
            stringPickNum = sc.nextLine();
            pickNum = Integer.parseInt(stringPickNum);
            if (pickNum != myNum) {
                System.out.println("Sorry. You get no more chances. :( ");
            } else {
                System.out.println("Good! You got it correct that time! :)");
            }
        } else {
            System.out.println("GREAT JOB! You picked " + pickNum + ". My random number is " + myNum + ".");
        }
    }
}
