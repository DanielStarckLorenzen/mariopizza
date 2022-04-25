package projekt;


import java.util.*;

public class UserInterface {

    Scanner in = new Scanner(System.in);

    public void printMenu() {
        System.out.print("""
                ------------------------------------- MENU ----------------------------------------------
                1.  Vesuvio:      tomatsauce, ost, skinke, og oregano................................57,-
                2.  Amerikaner:   tomatsauce, ost, oksefars, og oregano..............................53,-
                3.  Cacciatore:   tomatsauce, ost, pepperoni,og oregano..............................57,-
                4.  Carbona:      tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano....63,-
                5.  Dennis:       tomatsauce, ost, pepperoni, cocktailpølser og oregano..............65,-
                6.  Bertil:       tomatsauce, ost, bacon, og Oregano.................................57,-
                7.  Silvia:       tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano......61,-
                8.  Victoria:     tomatsauce, ost, skinke, ananas, champignon, løg og oregano........61,-
                9.  Toronfo:      tomatsauce, ost, skinke, bacon, kebab, chili og oregano............61,-
                10. Capricciosa:  tomatsauce, ost, skinke, champignon og oregano.....................61,-
                11. Hawai:        tomatsauce, ost, skinke, ananas og oregano.........................61,-
                12. Le Blissola:  tomatsauce, ost, skinke, rejer og oregano..........................61,-
                13. Venezia       tomatsauce, ost, skinke, bacon og oregano..........................61,-
                14. Mafia:        tomatsauce, ost, pepperoni, bacon, løg Og Oregano..................61,-
                """);
    }



    public String customerName() {
        System.out.print("Please enter customer name: ");
        return in.next();
    }

    public int setPickupTime() {
        System.out.print("Time of order: ");
        int orderTime = in.nextInt();
        return orderTime += 100;
    }

    public int deleteOrderNum() {
        System.out.print("Which order would you like to delete?: ");
        return in.nextInt();
    }

    public void displayListOfOrders(ArrayList<Orders> orders){


        System.out.print(orders + "\n");
    }
    public void displayNoOrders(){
        System.out.println("That is not an order on the list!");
    }
    public void displayOptions(){
        System.out.println("You have the following options: ");
        System.out.println(
                """ 
                "add" to add a pizza to your order,
                "exit" to end the program,
                "orders" to see the what you've ordered so far,
                "remove" to remove an item from the order,
                "delete" to delete the entire order,
                "cancel" to cancel your order.
                """);
    }
}