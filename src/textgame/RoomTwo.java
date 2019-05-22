package textgame;

import java.util.Scanner;

public class RoomTwo extends MainRoom {
        
    /*
        Creates and defines the second room of the game.
        Creates and defines the window and bookShelf objects.
        Defines the second_room table object.
    */
    
    Scanner in = new Scanner(System.in);
    private String window;
    private String bookShelf;
    
    // Initializes the objects:
    // room, table, window, and bookShelf
    public RoomTwo(String room, String table) {
        super(room, table);
        this.window = window;
        this.bookShelf = bookShelf;
    }
    
    // Defines the room and its objects
    // Returned as a string
    public String getRoom() {
        String room = super.getRoom();
        room = "This is the Second Room!\n"
                + "Objects in this room:\n"
                + "Table two\n"
                + "Window\n"
                + "Book Shelf\n"
                + "You can also exit back to\n"
                + "Main Room\n"
                + "Please type which object you would like to inspect ";
        return room;
    }
    
    // Defines the table object
    // Returned as a string
    public String getTable() {
        String table = super.getTable();
        table = "This contains a kitty\n"
                + "Would you like to KITnap the pretty kitty?\n";
        return table;
    }
    
    // Defines the window object
    // Takes user input
    // Displays a clue if user enters 'yes'
    public void getWindow() {
        this.window = "A dusted window that hasn't been cleaned in "
                + "quite some time.\n"
                + "Take a closer look?";
        System.out.println(window);
        System.out.println();
        // Variable to store user input
        String inspect = in.nextLine();
        System.out.println();
        // Displays clue if user input is 'yes'
        // Otherwise, call the getRoom() method
        // to display the room and its objects
        switch(inspect) {
            case "yes":
                System.out.println("This window really needs to be cleaned!\n"
                        + "Maybe a rag could help?");
                System.out.println();
                break;
            default:
                System.out.println(super.getRoom());
                break;
        }
    }
    
    // Defines the bookShelf object
    // Takes user input
    // Displays the 'rag' item if user enters 'yes'
    // Updates inventory if user takes the rag
    // Returned as a string
    public String getBookShelf() {
        this.bookShelf = "A large book shelf with lots of items!\n"
                + "Take a closer look?";
        System.out.println(bookShelf);
        System.out.println();
        // Variable to store input
        String inspect = in.nextLine();
        System.out.println();
        // Displays the 'rag' item if input is 'yes' and
        // takes user input
        // Otherwise, display the room via getRoom()
        switch(inspect) {
            case "yes":
                System.out.println("Look! Its a rag!\n"
                        + "Take the rag?");
                System.out.println();
                // Variable to store input
                String updateInv = in.nextLine();
                // Updates inventory if input is 'yes'
                // Otherwise, display the room via getRoom()
                switch(updateInv) {
                    case "yes":
                        return "Rag";
                    default:
                        System.out.println(super.getRoom());
                }
            default:
                System.out.println(super.getRoom());
        }
        return "";
    }
}
