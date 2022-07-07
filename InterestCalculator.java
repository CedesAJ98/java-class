import java.util.Scanner;

public class InterestCalculator {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you want to invest?");
        float investedMoney = sc.nextFloat();

        System.out.println("How many years are investing?");
        float investedYears = sc.nextFloat();

        System.out.println("What is the annual interest rate(in percentage)?");
        float annInterest = sc.nextFloat();

        System.out.println("Calculating..");
        System.out.println("");

        for (int i = 1; i <= investedYears; i++){

            float amount = (float) (investedMoney * Math.pow((1 + annInterest / 400), 4*1));

            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + investedMoney);
            System.out.println("Earned $" + (amount - investedMoney));
            System.out.println("Ended with $" + amount);
            System.out.println(" ");

            investedMoney = amount;
        }
    }
}
