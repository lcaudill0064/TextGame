package textgame;

import java.util.ArrayList;
import java.util.Scanner;

public class TextGame {
    /*
        -Main file that contains game logic.
        -Calls the pre-defined methods:
        Player(), Item(), Ineventory(),
        MainRoom(), RoomOne(), RoomTwo(),
        and RoomThree().
        -Ends the program once the user
        reaches the final room.
    */
    
    private Scanner in = new Scanner(System.in);
    
    public Player first_room(Player p) {
        String room_one = "This is the First Room!\n"
                + "The only object in this room is\n"
                + "Table One\n"
                + "You can also exit back to\n"
                + "Main Room\n"
                + "Please type which object you would like to inspect ";
        String table_one = "This contains a lock-pick\n"
                + "Would you like to grab the lock-pick?\n";
        RoomOne room = new RoomOne(room_one, table_one);
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.println(room.getDoor());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "table one":
                    if (p.validateItem("Lock pick"))
                        System.out.println("Tables empty!");
                    else {
                        System.out.println(room.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv)) {
                            p.addItem(new Item("Lock pick"));
                            System.out.println("The lock pick is "
                                    + "now in your inventory.");
                            System.out.println();
                        }
                    }
                    break;
                case "main room":
                    choice = "yes";
                    break;
            }
        }
        return p;
    }
    
    public Player second_room(Player p) {
        RoomTwo roomTwo = new RoomTwo("", "");
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.println(roomTwo.getRoom());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "table two":
                    if (p.validateItem("Kitty"))
                        System.out.println("Tables empty!");
                    else {
                        System.out.println(roomTwo.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv)) {
                            p.addItem(new Item("Kitty"));
                            System.out.println("the kitty is "
                                    + "now in your inventory.");
                            System.out.println();
                        }
                    }
                    break;
                case "window":
                    if (p.validateItem("Used Rag")) {
                        System.out.println("The window seems to be boarded "
                                + "up now.\n");
                        break;
                    }
                    if (!p.validateItem("Rag"))
                        roomTwo.getWindow();
                    else {
                        int count = 0;
                        System.out.println("Use the rag?");
                        updateInv = in.nextLine();
                        System.out.println();
                        if ("yes".equals(updateInv) && count == 0) {
                            System.out.println("After wiping the window\n"
                                    + "you discover "
                                    + "what appears to be a\n"
                                    + "lifeless corpse staring "
                                    + "directly at you.\n"
                                    + "RUN!\n");
                            p.removeItem("Rag");
                            p.addItem(new Item("Used Rag"));
                        }
                        else
                            break;
                    }
                    break;
                case "book shelf":
                    if (p.validateItem("Rag") || p.validateItem("Used Rag")) {
                        System.out.println("The book shelf is empty!");
                        System.out.println();
                    }
                    else {
                        String rag = roomTwo.getBookShelf();
                        if ("Rag".equals(rag)) {
                            p.addItem(new Item(rag));
                            System.out.println("the rag is "
                                    + "now in your inventory.");
                            System.out.println();
                        }
                        else
                            ;
                    }
                    break;
                case "main room":
                    choice = "yes";
                    break;
            }
        }
        return p;
    }
    
    public Player third_room(Player p) {
        RoomThree roomThree = new RoomThree("", "");
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.println(roomThree.getRoom());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "table three":
                    if (p.validateItem("Yarn"))
                        System.out.println("Tables empty!");
                    else {
                        System.out.println(roomThree.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv)) {
                            p.addItem(new Item("Yarn"));
                        }
                    }
                    break;
                case "main room":
                    choice = "yes";
                    break;
            }
        }
        return p;
    }
    
    public Player fourth_room(Player p) {
        String room_four = "This is the Fourth Room!\n"
                + "The only object in this room is\n"
                + "Table four\n"
                + "You can also exit back to\n"
                + "Main Room\n"
                + "Please type which object you would like to inspect ";
        String table_four = "This contains a password written on a piece "
                + "of paper.\n"
                + "Would you like to collect the password?\n";
        RoomOne room = new RoomOne(room_four, table_four);
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.println(room.getDoor());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "table four":
                    if (p.validateItem("Password"))
                        System.out.println("Tables empty!");
                    else {
                        System.out.println(room.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv)) {
                            p.addItem(new Item("Password"));
                        }
                    }
                    break;
                case "main room":
                    choice = "yes";
                    break;
            }
        }
        return p;
    }
    
    public Player winning_room(Player p) {
        String room_win = "This is the Winning Room!\n"
                + "The only object in this room is\n"
                + "Winning table\n"
                + "You can also exit back to\n"
                + "Main Room\n"
                + "Please type which object you would like to inspect ";
        String table_win = "This contains an axe.\n"
                + "Would you like to collect the axe?\n";
        RoomOne room = new RoomOne(room_win, table_win);
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.println(room.getDoor());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "winning table":
                    if (p.validateItem("Axe"))
                        System.out.println("Tables empty!");
                    else {
                        System.out.println(room.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv)) {
                            p.addItem(new Item("Axe"));
                        }
                    }
                    break;
                case "main room":
                    choice = "yes";
                    break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String main_room = "Starting from left to right, you see the following "
                + "doors around the room:\n"
                + "Room one\n"
                + "Room two\n"
                + "Room three\n"
                + "Room four\n"
                + "Winning room\n"
                + "End game\n"
                + "Table\n"
                + "Which object would you like to inspect first? ";
        String main_table = "This table contains a key!\n"
                + "I wonder which door it opens?\n"
                + "Would you like to grab the key?\n";
        MainRoom game = new MainRoom(main_room, main_table);
        Player player = new Player("Logan");
        
        String choice = "";
        String updateInv = "";
        while (!"yes".equals(choice)) {
            System.out.print("Inventory: ");
            player.displayInv();
            System.out.println();
            System.out.println(game.getRoom());
            System.out.println();
            String inspect = in.nextLine();
            System.out.println();
            switch(inspect) {
                case "room one":
                    if (player.validateItem("Key")) {
                        TextGame firstRm = new TextGame();
                        firstRm.first_room(player);
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires a key.");
                        System.out.println();
                    }
                    break;
                case "room two":
                    if (player.validateItem("Lock pick")) {
                        TextGame secondRm = new TextGame();
                        secondRm.second_room(player);
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires a lock pick.");
                        System.out.println();
                    }
                    break;
                case "room three":
                    if (player.validateItem("Kitty")) {
                        TextGame thirdRm = new TextGame();
                        thirdRm.third_room(player);
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires a kitty.");
                        System.out.println();
                    }
                    break;
                case "room four":
                    if (player.validateItem("Yarn")) {
                        TextGame fourthRm = new TextGame();
                        fourthRm.fourth_room(player);
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires yarn.");
                        System.out.println();
                    }
                    break;
                case "winning room":
                    if (player.validateItem("Password")) {
                        TextGame winningRm = new TextGame();
                        winningRm.winning_room(player);
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires a password.");
                        System.out.println();
                    }
                    break;
                case "end game":
                    if (player.validateItem("Axe")) {
                        System.out.println("You used the axe to break down "
                                + "the final door.\n"
                                + "YOU WIN!");
                        choice = "yes";
                    }
                    else {
                        System.out.println("DETAILS\n"
                                + "Requires an axe");
                        System.out.println();
                    }
                    break;
                case "table":
                    if (player.validateItem("Key")) {
                        System.out.println("Tables empty!");
                    }
                    else {
                        System.out.println(game.getTable());
                        updateInv = in.nextLine();
                        if ("yes".equals(updateInv))
                            player.addItem(new Item("Key"));
                    }
                    break;
            }
        }
    }
}
