package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String [] args){
        String noun1, adjective1, noun2, adjective2, plNoun1, plNoun2, plNoun3, presentVerb, pastVerb;
        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first noun.");
        noun1 = sc.nextLine();

        System.out.println("Enter the first adjective.");
        adjective1 = sc.nextLine();

        System.out.println("Enter the second noun.");
        noun2 = sc.nextLine();

        System.out.println("Enter a number.");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter you the second adjective.");
        adjective2 = sc.nextLine();

        System.out.println("Enter the first plural noun.");
        plNoun1 = sc.nextLine();

        System.out.println("Enter the second plural noun.");
        plNoun2 = sc.nextLine();

        System.out.println("Enter the last plural noun.");
        plNoun3 = sc.nextLine();

        System.out.println("Enter verb in present tense.");
        presentVerb = sc.nextLine();

        System.out.println("Enter the same verb in past tense.");
        pastVerb = sc.nextLine();

        System.out.println(noun1 + " the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + num1 + " year mission: to explore strange " + adjective2 + " " + plNoun1 + " to seek out " + adjective2 + " " + plNoun2 + " and " + adjective2 + " " + plNoun3 + " and " + adjective2 + " " + plNoun3 + ", to boldy " + presentVerb + " where no one has " + pastVerb + " before.");
    }
}
