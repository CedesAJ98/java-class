package com.sg.foundations.variables;

public class MenuOfChampions {
    public static void main (String [] args) {
        String restaurantName, restaurantMenu;
        String firstFood, secondFood, thirdFood;
        Float firstFoodPrice, secondFoodPrice, thirdFoodPrice;

        firstFood = "Crawfish";
        secondFood = "Crab Legs";
        thirdFood = "Shrimp";

        firstFoodPrice = 5.99f;
        secondFoodPrice = 20.00f;
        thirdFoodPrice = 13.99f;

        System.out.println("WELCOME TO YUMMY SEAFOOD IN THE TUMMY");
        System.out.println("Weekend Menu");
        System.out.println("$" + firstFoodPrice + "/lbs " + firstFood);
        System.out.println("$" + secondFoodPrice + " "+ secondFood);
        System.out.println("$" + thirdFoodPrice + " " + thirdFood);

    }

}
