package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String [] args){

        int tally = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lets play a game!");
        System.out.println("You have to get all three questions right to win the game!");
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("");

        System.out.println("What is Lil Wayne real name?");
        System.out.println("A. Daniel Wayne Carter");
        System.out.println("B. Dewayne Tunechi Carter");
        System.out.println("C. Dewayne Michael Carter Jr.");
        String wayneName = sc.nextLine();

        if (wayneName.equals("C")){
            System.out.println("You chose " + wayneName + " Good Job! ");
            tally = tally + 1;
        } else {
            System.out.println("You chose " + wayneName + ". His name is Dewayne Michael Carter Jr. ");
        }
        System.out.println("Your score is " + tally + ". You have 2 questions remaining.");
        System.out.println("");


        System.out.println("What is Lil Wayne age?");
        System.out.println("A. 50");
        System.out.println("B. 39");
        System.out.println("C. 43.");
        String wayneAge = sc.nextLine();

        if (wayneAge.equals("B")){
            System.out.println("You chose " + wayneAge + " Great!! ");
            tally = tally + 1;
        } else {
            System.out.println("You chose " + wayneAge + ". He is 39. ");
        }
        System.out.println("Your score is " + tally + ". You have 1 question remaining.");
        System.out.println("");


        System.out.println("What month was Lil Wayne born?");
        System.out.println("A. September");
        System.out.println("B. October");
        System.out.println("C. November");
        String wayneMonth = sc.nextLine();

        if (wayneMonth.equals("A")){
            System.out.println("You chose " + wayneMonth);
            tally = tally + 1;
        } else {
            System.out.println("You chose " + wayneMonth + ". His was born in September. ");
        }
        System.out.println("Your final score is " + tally );
        System.out.println("");

    }
}
