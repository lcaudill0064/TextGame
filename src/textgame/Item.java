package textgame;

public class Item {
    
    /*
        Creates and defines the items of the game.
    */
    
    private String item;
    
    // Initializes the item object
    public Item(String i) {
        this.item = i;
    }
    
    // Defines the item object
    // Returned as a string
    public String getItem() {
        return this.item;
    }
    
    // Displays the item object
    // Returned as a string
    public String toString() {
        String newString = item;
        return newString;
    }
}
