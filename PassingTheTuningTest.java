package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuningTest {
    public static void main (String [] args){
        String name, myName, favColor, favFood;
        int favNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + " My name is Cedes.");

        System.out.println("What is your favorite color? ");
        favColor = sc.nextLine();
        System.out.println("Nice. I like " + favColor + " too.");

        System.out.println("What is your favorite food? ");
        favFood = sc.nextLine();
        System.out.println(favFood + " sounds good,");


        System.out.println("What is your favorite number?  ");
        favNum = Integer.parseInt(sc.nextLine());
        System.out.println("Okay. " + favNum + " is your lucky number!");

        System.out.println("Goodbye " + name + "!");
    }
}
