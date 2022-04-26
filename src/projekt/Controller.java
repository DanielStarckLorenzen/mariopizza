package projekt;

import java.util.Locale;
import java.util.Scanner;

public class Controller {

    private boolean keepGoing = true;
    private Pizza pizzaOfChoice = null;
    private int orderNumber = 0;

    UserInterface ui = new UserInterface();
    Scanner in = new Scanner(System.in);
    List list = new List();

    public void start() {
        System.out.println("Starting up...");
        ui.printMenu();
        ui.displayOptions();

        while (keepGoing) {
            System.out.println("What do you want to do?");
            String answer = in.nextLine();

            switch (answer) {
                case "add" -> addOrder();
                case "exit" -> exit();
                case "orders" -> displayOrderList();
                case "delete", "cancel" -> cancelOrder();
                case "remove" -> removePizza();
                case "menu" -> ui.printMenu();
                case "h","help" -> ui.displayOptions();
                default -> System.out.println("That's not a command! Type h or help to see the list of options");
            }
        }
    }

    public void displayOrderList() {

        ui.displayListOfOrders(list.listOfOrders);
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
                case "12", "le blissola" -> pizzaOfChoice = new Pizza(12, "le blissola", 61);
                case "13", "venezia" -> pizzaOfChoice = new Pizza(13, "venezia", 61);
                case "14", "mafia" -> pizzaOfChoice = new Pizza(14, "mafia", 61);
                default -> System.out.println("That's not a pizza on the menu");
            }

            list.listOfOrders.get(orderNumber-1).addPizzaToList(pizzaOfChoice);
            list.listOfOrders.get(orderNumber-1).setTotalPrice(pizzaOfChoice.getPrice());
        }
    }

    public void removePizza() {
        System.out.print("Select an order: ");
        int orderNum = in.nextInt() - 1;
        if (orderNum > list.listOfOrders.size()) {
            System.out.println("That order doesn't exist");
        }
        else {

            System.out.println("Which pizza would you like to remove? " + list.listOfOrders.get(orderNum) + "\n");
            int pizzaToBeRemoved = in.nextInt();
            list.listOfOrders.get(orderNum).removePizzaFromList(pizzaToBeRemoved);
        }
        in.nextLine();
    }

    public void exit() {
        ui.exit();
        keepGoing = false;
    }
}