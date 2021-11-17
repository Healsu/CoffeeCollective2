import Factory.DrinkFactory;
import products.*;
import statistics.CoffeeTypeCounter;
import ui.Menu;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;

import java.util.stream.Collectors;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        //Currently everything is in main... Hmm maybe someone should fix this? Maybe if one had a pattern to follow
        //Could be a pattern to "control" the flow of execution
        OrderTakingMenu orderMenu = new OrderTakingMenu();
        StatisticsMenu statisticsMenu = new StatisticsMenu();

        orderMenu.welcomeUser();
        int userInput;
        CustomerBasket currentCustomer = new CustomerBasket();
        do{
            orderMenu.printOptions();
            userInput = orderMenu.receiveUserInput();
            switch(userInput){
                case 1:
                    currentCustomer.addToAmericano((Americano) DrinkFactory.factoryBeverage(userInput));
                    CoffeeTypeCounter.oneAmericanoSold();
                    break;
                case 2:
                    currentCustomer.addToEspresso((Espresso) DrinkFactory.factoryBeverage(userInput));
                    CoffeeTypeCounter.oneEspressoSold();
                    break;
                case 3:
                    currentCustomer.addToTea((Tea) DrinkFactory.factoryBeverage(userInput));
                    CoffeeTypeCounter.oneTeaSold();
                    break;
                case 4:
                    currentCustomer.addToCroissant((Croissant) DrinkFactory.factoryFood(userInput));
                    CoffeeTypeCounter.oneCroissantSold();
                    break;
                case 5:
                    currentCustomer.addToBaguette((Baguette) DrinkFactory.factoryFood(userInput));
                    CoffeeTypeCounter.oneBaguetteSold();
                    break;
                case 6:
                    statisticsMenu.printStatisticsChoice();
                    switch (statisticsMenu.receiveUserInput()){
                        case 1:
                            statisticsMenu.displayCoffeeStatistics();
                            break;
                        case 2:
                            statisticsMenu.displayFoodStatistics();
                            break;
                        case 3:
                            statisticsMenu.displayTotalsStatistics();
                            break;
                        default:
                            System.out.println("tag dig sammen og skriv rigtigt");
                            break;
                    }
                    break;
                case 7:
                    System.out.println(CustomerBasket.basket.stream().map(Object::toString)
                            .collect(Collectors.joining("\n")));
                    System.out.println("your totalprice so far is " + currentCustomer.getTotalPrice());
            }
        }while(userInput != 9);
    }
}
