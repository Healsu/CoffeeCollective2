package products;

public class Croissant {
    private String title = "Croissant";
    private int price = 20;

    public Croissant() {
    }

    public Croissant(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Croissant: " +
                "price= " + price +
                '.';
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
