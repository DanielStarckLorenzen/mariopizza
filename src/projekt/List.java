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

    StringBuilder printList() {
        StringBuilder sb = new StringBuilder();
        sb.append(pizzaList);
        return sb;
    }

    @Override
    public String toString() {
        return "Order" + listOfOrders;
    }

}
