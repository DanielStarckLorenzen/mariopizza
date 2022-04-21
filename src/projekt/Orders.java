package projekt;

import java.util.ArrayList;

public class Orders {




    private int customerId;
    private String name;
    Pizza pizzas;
    private String pickUpTime;
    private int totalPrice;

    Orders (int customerId, String name, Pizza pizzas, String pickUpTime, int totalPrice) {
        this.customerId = customerId;
        this.name = name;
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        this.totalPrice = totalPrice;
    }

}
