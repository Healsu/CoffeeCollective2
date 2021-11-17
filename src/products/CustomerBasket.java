package products;

import java.util.ArrayList;

public class CustomerBasket {
    private ArrayList<Americano> americansOrdered = new ArrayList<Americano>();
    private ArrayList<Espresso> espressosOrdered = new ArrayList<Espresso>();
    private ArrayList<Tea> teaOrdered = new ArrayList<Tea>();
    private ArrayList<Croissant> croissantsOrdered = new ArrayList<Croissant>();
    private ArrayList<Baguette> baguettesOrdered = new ArrayList<Baguette>();
    public static ArrayList<String> basket = new ArrayList<>();
    private int totalPrice = 0;

    //Vi laver en default instans af hvert objekt så vi kan tilføje prisen af de indivduelle objekter via metodekaldet getPrice til vores basket
    Americano americano = new Americano();
    Espresso espresso = new Espresso();
    Tea tea = new Tea();
    Croissant croissant = new Croissant();
    Baguette baguette = new Baguette();


    public void addToAmericano(Americano order){
        americansOrdered.add(order);
        basket.add(String.valueOf(new Americano(americano.getPrice())));
        setTotalPrice(americano.getPrice());
    }
    public void addToEspresso(Espresso order){
        espressosOrdered.add(order);
        basket.add(String.valueOf(new Espresso(espresso.getPrice())));
        setTotalPrice(espresso.getPrice());
    }
    public void addToTea(Tea order){
        teaOrdered.add(order);
        basket.add(String.valueOf(new Tea(tea.getPrice())));
        setTotalPrice(tea.getPrice());
    }
    public void addToCroissant(Croissant order){
        croissantsOrdered.add(order);
        basket.add(String.valueOf(new Croissant(croissant.getPrice())));
        setTotalPrice(croissant.getPrice());
    }
    public void addToBaguette(Baguette order){
        baguettesOrdered.add(order);
        basket.add(String.valueOf(new Baguette(baguette.getPrice())));
        setTotalPrice(baguette.getPrice());
    }

    public int setTotalPrice(int price){
        totalPrice += price;
        return totalPrice;
    }

    public int getTotalPrice(){
        return totalPrice;
    }
}
