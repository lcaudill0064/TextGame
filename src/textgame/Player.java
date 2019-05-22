package textgame;

public class Player extends Inventory {
    
    /*
        Class to create a name for the user,
        display the name, and display the
        users current inventory.
    */
    
    private String name;
    
    public Player(String n) {
        this.name = n;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void displayStats() {
        System.out.println(name);
        super.displayInv();
    }
    
    public void displayName() {
        System.out.println(name);
    }
}
