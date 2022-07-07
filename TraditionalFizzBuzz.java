package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = sc.nextInt();

        for(int i = 0; i <= userNum; i++) {
            if (i == 0) {
                System.out.println(i);
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        } System.out.println("TRADITION!!!!! ");

    }
}
