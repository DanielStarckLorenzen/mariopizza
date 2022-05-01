package projekt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class UserInterface {

    ArrayList<String> menu = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public int pizzaChoice(){
        System.out.println("Which pizza would you like to order: ");
        return in.nextInt();
    }


    public int amountOfPizzasToOrder(){
        System.out.println("How many pizzas would you like to order? ");
        return in.nextInt();
    }

    public void userChoice(){
        System.out.println("Enter choice: ");
    }

    public void loadMenu() throws FileNotFoundException {
        System.out.println("Loading menu...");
        Scanner sc = new Scanner(new File("menukort.csv"));
        String loadMenu = sc.nextLine();
        while (sc.hasNextLine()){
            loadMenu = sc.nextLine();
            menu.add(loadMenu);
            System.out.println(loadMenu);
        }
    }

    public void printMenu() throws FileNotFoundException {
        /*PrintStream out = new PrintStream(new File("menukort.csv"));
        out.print("""
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
                """);*/
    }

    public String customerName() {
        System.out.print("Please enter customer name: ");
        return in.next();
    }

    public int setPickupTime() {
        System.out.print("Time of Order: ");
        int orderTime = in.nextInt();
        System.out.print("Is the order through phone or in shop? (shop/phone)");
        String inShopOrPhone = in.next().toLowerCase(Locale.ROOT);
        if (inShopOrPhone.equals("shop"))
            return orderTime += 15;
        else
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
                "menu" to see the menu,
                "add" to add a pizza to your order,
                "orders" to see the what you've ordered so far,
                "remove" to remove an item from the order,
                "delete" to delete the entire order,
                "exit" to end the program,
                """);
    }

    public void exit(){
        System.out.println("Program will now exit");
    }
}