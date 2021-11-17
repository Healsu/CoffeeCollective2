package products;

public class Baguette {
    private String title = "Baguette";
    private int price = 30;

    public Baguette() {
    }

    public Baguette(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Baguette:" +
                "price= " + price +
                '.';
    }
}
