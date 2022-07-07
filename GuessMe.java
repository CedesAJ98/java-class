package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main (String [] args){
        int myNum = 24;
        int pickNum;
        String stringPickNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number from 1 to 50");
        stringPickNum = sc.nextLine();
        pickNum = Integer.parseInt(stringPickNum);

        System.out.println(pickNum);

        if (pickNum > myNum){
            System.out.println("You picked " + pickNum + ". Your number is to high.");
        }
        if (pickNum < myNum){
            System.out.println("You picked " + pickNum + ". Your number is too low.");
        }
        if (pickNum == myNum){
            System.out.println("GREAT JOB! You picked " + pickNum);
        }


    }
}
