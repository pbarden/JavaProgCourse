/*
* No license; intellectual property of Dennis Paul Barden
* Created for PRG 215 at University of Phoenix
*/

package week_1;
import java.util.Scanner;

/**
 *
 * @author Dennis Paul Barden
 */
public class PRG215_Week_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);
        
        //Display on the console - ask for customer's name
        System.out.print("Please enter your name: ");
        
        //Get the customer name from the keyboard and store it in the String object "customerName"
        String customerName = keyboard.next();
        System.out.println("");
        
        //Display the customer's name on the console using println()
        System.out.println("Welcome, " + customerName + "!");
        
    }
    
}
