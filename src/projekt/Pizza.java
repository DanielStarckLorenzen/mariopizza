package projekt;

import java.util.Scanner;

public class Pizza {


    private int number;
    private String name;
    private int price;

    Pizza (int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public void allPizzas() {
        Pizza pizza1 = new Pizza(1, "Vesuvio", 57);
    }

    public void setPizza() {

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nPizza: " +
                "number: " + number +
                ", name: " + name +
                ", price: " + price;
    }
}
