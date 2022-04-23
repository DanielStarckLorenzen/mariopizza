package projekt;

import java.sql.Time;
import java.util.ArrayList;

public class Orders {

    private int customerId;
    private String name;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private int pickUpTime;
    private int totalPrice;

    Orders (int customerId, String name, ArrayList<Pizza> pizzas, int pickUpTime) {
        this.customerId = customerId;
        this.name = name;
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        //this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "\nOrder: " +
                "customerId: " + customerId +
                ", name: " + name +
                ", pizzas: " + pizzas +
                ", pickUpTime: " + pickUpTime + "\n";
    }
}
