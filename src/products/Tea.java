package products;

public class Tea {
    private String title = "Tea";
    private int price = 60;

    public Tea() {
    }

    public Tea(int price) {
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
        return "Tea: " +
                "price= " + price +
                '.';
    }
}
