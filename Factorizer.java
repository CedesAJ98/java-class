import java.util.Scanner;

public class Factorizer {
    public static void main (String [] args){

        int i;
        int myCounter = 0;
        int userNumSum = 0;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNum = sc.nextInt();

        System.out.println("The factors of " + userNum + " are:");

        for (i = 1; i < userNum; i++){
            if (userNum % i == 0) {
                System.out.print(i);
                System.out.print(" ");
                myCounter++;
                userNumSum += i;
            }
        }

        System.out.println(" ");
        System.out.println(userNum + " has " + myCounter + " factor(s).");

        if(userNumSum == userNum) {
            System.out.println(userNum + " is a perfect number.");
        } else {
            System.out.println(userNum + " is not a perfect number.");
        }

        for (int j = 2; j <= userNum / 2; j++) {
            if (userNum % j == 0) {
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println(userNum + " is a prime number.");
        else
            System.out.println(userNum + " is not a prime number.");
    }

}
