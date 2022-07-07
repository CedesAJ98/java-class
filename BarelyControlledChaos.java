package com.sg.foundations.flowcontrol.methods;
import java.util.Random;

public class BarelyControlledChaos {
    public static void main (String [] args) {

        int color = color(); // call color method here
        int animal = animal(); // call animal method again here
        int colorAgain = color(); // call color method again here
        int weight = number(); // call number method,
        // with a range between 5 - 200
        int distance = number(); // call number method,
        // with a range between 10 - 20
        int number = number(); // call number method,
        // with a range between 10000 - 20000
        int time = number(); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");

    }

    public static int color(){
        Random randomizer = new Random();
        int randColor = randomizer.nextInt(4);

        switch(randColor) {
            case 0:
                System.out.println("Red");
                break;

            case 1:
                System.out.println("Blue");
                break;

            case 2:
                System.out.println("Pink");
                break;

            case 3:
                System.out.println("Purple");
                break;

            case 4:
                System.out.println("Black");
                break;
        }
        return randColor;
    }

    public static int animal() {
        Random randomizer = new Random();
        int randAnimal = randomizer.nextInt(4);

        switch(randAnimal) {
            case 0:
                System.out.println("Horse");
                break;

            case 1:
                System.out.println("Cow");
                break;

            case 2:
                System.out.println("Cat");
                break;

            case 3:
                System.out.println("Deer");
                break;

            case 4:
                System.out.println("Pig");
                break;
        }
        return randAnimal;

    }

    public static int number() {
        return 6;

    }
}
