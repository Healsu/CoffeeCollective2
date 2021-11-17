package products;

public class Espresso {
    private String title = "Espresso";
    private int price = 40;

    public Espresso() {
    }

    public Espresso(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Espresso: " +
                "price= " + price +
                '.';
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public static int getEspressoCount(){
     return 0;
    }

}
