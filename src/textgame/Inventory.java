package textgame;

import java.util.ArrayList;

public class Inventory {
    
    /*
        Creates and defines the inventory of the game.
        Stores the item objects into an ArrayList through
        importing the ArrayList java library.
    */
    
    ArrayList <Item> inventory;
    
    // Initializes the inventory object
    public Inventory() {
        this.inventory = new ArrayList<Item>();
    }
    
    // Updates the inventory by adding
    // an item to the ArrayList
    public void addItem(Item item) {
        this.inventory.add(item);
    }
    
    // Updates the inventory by removing
    // an item from the ArrayList
    public void removeItem(String s) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItem().equals(s))
                inventory.remove(i);
        }
    }
    
    // Checks to see if an item is in
    // the ArrayList
    public Boolean validateItem(String s) {
        for (Item i: inventory) {
            if (i.getItem().equals(s)) {
                return true;
            }
        }
        return false;
    }
    
    // Displays each item to the user
    // in the inventory ArrayList.
    // If it is empty, print 'EMPTY'
    public void displayInv() {
        if (inventory.size() == 0)
            System.out.println("EMPTY");
        for (Item item: this.inventory) {
            int size = inventory.size()-1;
            if (inventory.get(size) != item)
                System.out.print(item + ", ");
            else
                System.out.println(item);
        }
    }
}
