package Factory;
import products.*;

public abstract class DrinkFactory {
    public static Object factoryBeverage(int beverage) {
        switch(beverage) {
            case 1:
                return new Americano();
            case 2:
                return new Espresso();
            case 3:
                return new Tea();
            default:
                System.out.println("WRONG!");
                return null;
        }
    }
    public static Object factoryFood(int food) {
        switch (food) {
            case 4:
                return new Croissant();
            case 5:
                return new Baguette();
            default:
                System.out.println("WRONG!");
                return null;
        }
    }
}
