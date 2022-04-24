package projekt;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private String answer;
    private boolean keepGoing = true;
    private int totalPrice;
    private Pizza pizzaOfChoice = null;
    private int orderNumber = 0;
    private Pizza pizzaGone = null;

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
                case "add" -> addOrder();
                case "exit" -> exit();
                case "orders" -> ui.displayListOfOrders(list.listOfOrders);
                case "remove", "delete", "cancel" -> cancelOrder();
                case "menu" -> ui.printMenu();

            }
        }
    }

    public void cancelOrder() {
        int orderNumToDelete = ui.deleteOrderNum()-1;
        if (list.listOfOrders.size() > 0 && orderNumToDelete <= list.listOfOrders.size()){
            list.listOfOrders.remove(orderNumToDelete);
        } else {
            ui.displayNoOrders();
        }


    }

    public void addOrder() {

        orderNumber++;
        list.listOfOrders.add(new Orders());
        list.listOfOrders.get(orderNumber-1).setName(ui.customerName());
        list.listOfOrders.get(orderNumber-1).setPickUpTime(ui.setPickupTime());
        list.listOfOrders.get(orderNumber-1).setOrderNumber(orderNumber);
        addPizza();


        /*
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

        for (int i = 0; i < ; i++) {
            Orders newOrder = new Orders(customerId, name, list.pizzaList, time);
            list.addingOrder(newOrder);
            System.out.println(list.listOfOrders);
        }

         */

    }

    public void addPizza() {
        System.out.println("How many pizzas would you like to order? ");
        int amountOfPizzas = in.nextInt();
        in.nextLine();
        for (int i = 0; i < amountOfPizzas; i++) {

            String pizzaChoice;
            System.out.println("What pizza would you like to add?");
            pizzaChoice = in.nextLine().toLowerCase(Locale.ROOT);

            switch (pizzaChoice) {
                case "1", "vesuvio" -> pizzaOfChoice = new Pizza(1, "vesuvio", 57);
                case "2", "amerikaner" -> pizzaOfChoice = new Pizza(2, "amerikaner", 53);
                case "3", "cacciatore" -> pizzaOfChoice = new Pizza(3, "cacciatore", 57);
                case "4", "carbona" -> pizzaOfChoice = new Pizza(4, "Carbona", 63);
                case "5", "dennis" -> pizzaOfChoice = new Pizza(5, "dennis", 65);
                case "6", "bertil" -> pizzaOfChoice = new Pizza(6, "bertil", 57);
                case "7", "silvia" -> pizzaOfChoice = new Pizza(7, "silvia", 61);
                case "8", "victoria" -> pizzaOfChoice = new Pizza(8, "victoria", 61);
                case "9", "toronfo" -> pizzaOfChoice = new Pizza(9, "toronfo", 61);
                case "10", "capricciosa" -> pizzaOfChoice = new Pizza(10, "capricciosa", 61);
                case "11", "hawai" -> pizzaOfChoice = new Pizza(11, "hawai", 61);

            }
            //totalPrice += pizzaOfChoice.getPrice();
            list.listOfOrders.get(orderNumber-1).addPizzaToList(pizzaOfChoice);
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
