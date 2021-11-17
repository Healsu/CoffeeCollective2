package ui;

import java.util.Scanner;

public class OrderTakingMenu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void welcomeUser(){
        System.out.println("Hello and welcome");
        System.out.println("What would you like to order?");
    }

    public void printOptions(){
        System.out.println("1. Americano");
        System.out.println("2. Espresso");
        System.out.println("3. Tea");
        System.out.println("4. Croissant");
        System.out.println("5. Baguette");
        System.out.println("6. Statistics Menu");
        System.out.println("7. Approve basket contents");
        System.out.println("9. Quit");
    }
}
