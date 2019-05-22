package textgame;

import java.util.Scanner;

public class RoomThree extends MainRoom {
    
    /*
        Creates and defines the third room of the game.
        Defines the third_room table object.
    */
    
    Scanner in = new Scanner(System.in);
    
    // Initialize the objects:
    // room and table
    public RoomThree(String room, String table) {
        super(room, table);
    }
    
    // Defines the room and its objects
    // Returned as a string
    public String getRoom() {
        String room = super.getRoom();
        room = "This is the Third Room!\n"
                + "The only object in this room is\n"
                + "Table three\n"
                + "You can also exit back to\n"
                + "Main Room\n"
                + "Please type which object you would like to inspect ";
        return room;
    }
    
    // Defines the table object
    // Returned as a string
    public String getTable() {
        String table = super.getTable();
        table = "This contains a thread of yarn.\n"
                + "Would you like to collect the yarn?\n";
        return table;
    }
}
