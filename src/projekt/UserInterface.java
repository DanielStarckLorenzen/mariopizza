package projekt;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner in = new Scanner(System.in);

    public void add() {
        System.out.println("What pizza do you want to add");

    }

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
        System.out.print("Time of pickup: ");
        return in.nextInt();
    }
    public void displayListOfOrders(ArrayList<Orders> orders){
        System.out.print(orders + "\n");
    }


}
