package products;

public class Americano{
    private String title = "Americano";
    private int price = 15;
    private static int americano;

    public Americano(/*String title, int price*/) {
        //this.title = title;
        //this.price = price;
        americano++;
    }

    public Americano(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
    public static int getAmericanoCount(){
        return americano;
    }

    @Override
    public String toString() {
        return "Americano" +
                ", price= " + price + ". ";
    }
}
