package projekt;

import java.util.ArrayList;


public class List {

    ArrayList<Orders> listOfOrders = new ArrayList<>();

    @Override
    public String toString() {
        return "\n\nOrder" + listOfOrders;
    }
}