package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Should I do it? (y/n)" );

        //if I tell it to do it, it will print "I did it!"
        //if I tell it not to do it, it will print "I know you said not to .. but I totally did anyways"


        boolean doIt;

        if(sc.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        // do {
        //   iDidIt = true;
        //    break;
        // } while (doIt);

        while (doIt) {
           iDidIt = true;
            break;
        }
        //if I tell it to do it, it will print "I did it!"
        //if I tell it not to do it, it will print "I know you said not to .. but I totally did anyways"



        if(doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}
