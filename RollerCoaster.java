package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;

public class RollerCoaster {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("We are going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;

        while(keepRiding.equals("y")) {
         // while(keepRiding.equals("n")) { //the program will not start loop because keep riding is not equal to "n"
            System.out.println("WHEEEEEEEEEEEEEEEEEeEeEEEEeEeeee...!!!");
            System.out.println("Want to keep going? (y/n): ");
            keepRiding = sc.nextLine();  //if user enters anything other than y, the program will exit loop
            loopsLooped++;
        }
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped through that loop " + loopsLooped + " times!!");
    }
}
