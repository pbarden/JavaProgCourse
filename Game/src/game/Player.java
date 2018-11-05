package game;

import java.util.Scanner;

/**
 *
 * @author paulb
 */
public class Player {
    private String playerName;
    private int gamesWon;

    public void setPlayerName() {
        //Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);

        //Creates variables used in player creation
        boolean playerIsSet = false;
        String newName;
        String answer;

        while (playerIsSet == false) {
            //Asks the player for their name
            System.out.println("What is your name?");
            newName = keyboard.nextLine();

            //Check to ensure name is correct
            System.out.println("Your name is " + newName + "?");
            System.out.println("Enter Y = Yes or N = No");
            answer = keyboard.next();
            
            //Saves player name if it's correct
            if(answer.equals("Y")) {
                playerName = newName;
                playerIsSet = true;
            if(answer.equals("N"))
                System.out.println("Starting over...");
            }
        }

        //Verifies that the player name was saved
        System.out.println("Thanks, " + playerName + ". Your name has been saved.");
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void gameWasWon() {
        this.gamesWon += 1;
    }

    public int getGamesWon() {
        return this.gamesWon;
    }
}