package ui;

import java.util.Scanner;

public abstract class Menu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void welcomeUser(){
        System.out.println("Hello and welcome");
        System.out.println("What would you like to order?");
    }
}
