package projekt;

import java.util.ArrayList;

public class List {


    ArrayList<Orders> listOfOrders = new ArrayList<>();



    public void addingOrder(Orders orderToBeAdded) {
        listOfOrders.add(orderToBeAdded);
    }


    @Override
    public String toString() {
        return "\n\nOrder" + listOfOrders;
    }

}
