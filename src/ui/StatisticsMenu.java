package ui;

import statistics.CoffeeTypeCounter;

import java.util.Scanner;

public class StatisticsMenu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void printStatisticsChoice(){
        System.out.println("1. Coffee statistics");
        System.out.println("2. Food statistics");
        System.out.println("3. Sold statistics");
    }

    public void displayCoffeeStatistics(){
        System.out.println(CoffeeTypeCounter.howManyCoffeesSold() + " Coffees sold");
    }

    public void displayFoodStatistics(){
        System.out.println(CoffeeTypeCounter.howManyFoodsSold() + " Foods sold");
    }

    public void displayTotalsStatistics(){
        System.out.println(CoffeeTypeCounter.howManySoldInTotal() + " Total sales");
    }
}
