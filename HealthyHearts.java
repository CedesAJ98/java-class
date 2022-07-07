package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {
    public static void main (String [] args){
        int age, heartRate, hrZone;
        float hrZone2;


        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age? ");
        age = Integer.parseInt(sc.nextLine());

        heartRate = 220 - age;
        hrZone = heartRate / 2 ;
        hrZone2 = 0.85f * heartRate;

        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute." );
        System.out.println("Your target HR Zone is " + hrZone + " - " + hrZone2 + " beats per minute." );
    }
}
