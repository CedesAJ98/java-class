import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main (String [] args) {
        int counter = 0;
        int userDollars = 0;
        int maxDollars = userDollars;
        int countAtMax = 0;

        Scanner sc = new Scanner(System.in); //initiate scanner
        Random randomizer = new Random(); //initiate randomizer

        System.out.println("How many dollars do you have?");
        userDollars = sc.nextInt();

        while(userDollars > 0) {

            int diceRoll = randomizer.nextInt(6) + 1; //first dice roll
            int diceRoll2 = randomizer.nextInt(6) + 1;//second dice roll
            counter++; //calculate winnings or losses

            if(diceRoll + diceRoll2 == 7) { //if dice rolls equal to 7, give user $4; if not subtract $1
                userDollars += 4;
            } else {
                userDollars -= 1;
            }

            if(userDollars > maxDollars){
                maxDollars = userDollars;
                countAtMax = counter;
            }

        }
        System.out.println("You are broke after " + counter + " rolls.");
        System.out.println("You should have quit after " + countAtMax + " rolls when you had " + maxDollars + " dollars.");

    }
}
