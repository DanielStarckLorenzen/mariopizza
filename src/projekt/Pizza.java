package projekt;

public class Pizza {

    private int number;
    private String name;
    private int price;

    Pizza (int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\nPizza: " +
                "number: " + number +
                ", name: " + name +
                ", price: " + price;
    }
}
