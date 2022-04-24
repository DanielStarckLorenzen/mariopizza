package projekt;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Orders {

    private int customerId;
    private String name;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private int pickUpTime;
    private int totalPrice;
    private int orderNumber;
    Scanner in = new Scanner(System.in);


    /*
    Orders (int customerId, String name, ArrayList<Pizza> pizzas, int pickUpTime) {
        this.customerId = customerId;
        this.name = name;
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        //this.totalPrice = totalPrice;
    }

     */

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }



    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void addPizzaToList(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public void cancelPizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }

    public void removePizzaFromList(int pizzaNumber){
        for (int i = 0; i < this.pizzas.size(); i++) {
            if (this.pizzas.get(i).getNumber() == pizzaNumber){
                pizzas.remove(i);
                i = this.pizzas.size();
            } else if (this.pizzas.get(i).getNumber() != pizzaNumber && this.pizzas.size() > i){
                System.out.println("that pizza doesnt exist in the order");
            }
        }
    }

    @Override
    public String toString() {
        return "\nOrder # "+orderNumber +
                ", name: " + name +
                ", pizzas: " + pizzas +
                ", pickUpTime: " + pickUpTime + "\n";
    }
}
