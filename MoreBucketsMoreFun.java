package com.sg.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String [] args){
        int butterflies, beetles, bugs;
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // shows dog ate one butterflies. subtracts one from 5
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left..."); // stays the same because nothing is subtracted from bugss
        System.out.println("...maybe my computer can't do math, after all!");
    }
}
