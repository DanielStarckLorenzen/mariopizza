package projekt;

import java.util.ArrayList;

public class List {

    ArrayList<Pizza> pizzaList = new ArrayList<>();
    ArrayList<Orders> listOfOrders = new ArrayList<>();


    public void addingPizza(Pizza pizzaToBeAdded) {
        pizzaList.add(pizzaToBeAdded);
    }

    public void addingOrder(Orders orderToBeAdded) {
        listOfOrders.add(orderToBeAdded);
    }


    @Override
    public String toString() {
        return "\n\nOrder" + listOfOrders;
    }

}
