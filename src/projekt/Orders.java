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

    public void setTotalPrice(int pizzaPrize) {
        this.totalPrice += pizzaPrize;
    }
    public void addPizzaToList(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public void removePizzaFromList(int pizzaNumber) {
        int pizzaSize = this.pizzas.size();
        for (int i = 0; i < this.pizzas.size(); i++) {
            if (this.pizzas.get(i).getNumber() == pizzaNumber) {
                this.setTotalPrice(-this.pizzas.get(i).getPrice());
                System.out.printf("%s has been removed from the order.", this.pizzas.get(i).getName());
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
