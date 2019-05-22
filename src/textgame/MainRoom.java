package textgame;

import java.util.ArrayList;

public class MainRoom {
    
    /*
        Creates and defines the main room of the game.
        Creates and defines the table object.
    */
    
    private String room;
    private String table;
    
    // Initializes the objects:
    // room and table
    public MainRoom(String m, String t) {
        this.room = m;
        this.table = t;
    }
    
    public String getRoom() {
        return this.room;
    }
    
    public String getTable() {
        return this.table;
    }
    
    public String toString() {
        String newString = room;
        return newString;
    }
}
