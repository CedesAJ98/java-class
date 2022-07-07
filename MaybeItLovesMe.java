package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;

public class MaybeItLovesMe {
        public static void main (String [] args){

            Random randomizer = new Random();
            int myRand = randomizer.nextInt(89) + 13;

            System.out.println(myRand);


            while (myRand < 89) {
                System.out.println("It loves me NOT!");
                myRand++;
                System.out.println("It loves me!");
                myRand++;
            }

            //I used while loop because it is not important for the loop to run at least one but 34 times

            System.out.println("Okay. You've had " + myRand + " petals. It loves you!!");


        }
}
