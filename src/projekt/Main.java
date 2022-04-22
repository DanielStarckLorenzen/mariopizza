package projekt;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private String answer;
    private boolean keepGoing = true;
    private int totalPrice;
    private Pizza pizzaOfChoice = null;

    UserInterface ui = new UserInterface();
    Scanner in = new Scanner(System.in);
    List list = new List();
    Pizza pizza;

    public void go() {
        start();
    }

    public void start() {

        System.out.println("Starting up...");
        ui.printMenu();

        while (keepGoing) {
            System.out.println("What do you want to do?");
            answer = in.nextLine();

            switch (answer) {
                case "add" -> {
                    addOrder();
                }
                case "exit" -> exit();
            }
        }
    }

    public void addOrder() {

        System.out.println("What's the name of the customer?");
                String name = in.nextLine();
                System.out.println("What's the time now? (ex. 11:00 = 1100)");
                int time = in.nextInt();
                time += 100;
                in.nextLine();



        addPizza();

        int customerId = 1;
        for (int i = 0; i < list.listOfOrders.size(); i++) {
            customerId++;
        }


        Orders newOrder = new Orders(customerId, name, list.pizzaList, time);
        list.addingOrder(newOrder);
        System.out.println(list.listOfOrders);
    }

    public void addPizza() {
        System.out.print("How many pizzas would you like to order? ");
        int amountOfPizzas = in.nextInt();
        in.nextLine();
        for (int i = 0; i < amountOfPizzas; i++) {

            String pizzaChoice;
            System.out.println("What pizza would you like to add?");
            pizzaChoice = in.nextLine().toLowerCase(Locale.ROOT);

            switch (pizzaChoice) {
                case "1", "vesuvio" -> pizzaOfChoice = new Pizza(1, "vesuvio", 57);
                case "2", "amerikaner" -> pizzaOfChoice = new Pizza(2, "amerikaner", 53);

            }
            //totalPrice += pizzaOfChoice.getPrice();
            list.addingPizza(pizzaOfChoice);
        }
    }


    public void exit() {
        System.out.println("You exited the program!");
        keepGoing = false;
    }

    public static void main(String[] args) {
	new Main().go();
    }
}
