import Factory.DrinkFactory;
import controllers.OrderController;
import products.*;
import statistics.CoffeeTypeCounter;
import ui.Menu;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;

import java.util.stream.Collectors;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        OrderTakingMenu orderMenu = new OrderTakingMenu();
        OrderController orderController = new OrderController();
        orderMenu.welcomeUser();
        orderController.menuController();
    }
}
