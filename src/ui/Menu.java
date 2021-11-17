package ui;

import java.util.Scanner;

public abstract class Menu {
    //Vi bruger ikke menu klassen da Ordertaking menu har de samme metoder og dermed samlet ansvar på en enkelt klasse.
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
