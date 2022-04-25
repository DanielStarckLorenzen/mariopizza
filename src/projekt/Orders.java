package projekt;

import java.util.ArrayList;
import java.util.Scanner;

public class Orders {

    private String name;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private int pickUpTime;
    private int totalPrice;
    private int orderNumber;
    Scanner in = new Scanner(System.in);


    public void setName(String name) {
        this.name = name;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void addPizzaToList(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public void removePizzaFromList(int pizzaNumber){
        for (int i = 0; i < this.pizzas.size(); i++) {
            if (this.pizzas.get(i).getNumber() == pizzaNumber){
                pizzas.remove(i);
                i = this.pizzas.size();
            }

        }
        if (this.pizzas.size() == pizzaSize) {
            System.out.println("that pizza doesnt exist in the order");
        }
    }

    @Override
    public String toString() {
        return "\nOrder # "+orderNumber +
                ", name: " + name +
                ", pizzas: " + pizzas +
                ", pickUpTime: " + pickUpTime +
                ", total price: " + totalPrice + "\n";
    }
}
