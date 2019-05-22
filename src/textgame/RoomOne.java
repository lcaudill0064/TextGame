package textgame;

import java.util.ArrayList;

public class RoomOne extends MainRoom {
    
    /*
        Creates and defines the first room of the game.
        Defines the first_room table object.
    */
    
    // Initializes objects:
    // room and table
    public RoomOne(String room, String table) {
        super(room, table);
    }
    
    // Defines the room and its objects
    // Returned as a string
    public String getDoor() {
        return super.getRoom();
    }
    
    // Defines the table object
    // Returned as a string
    public String getTable() {
        return super.getTable();
    }
}
