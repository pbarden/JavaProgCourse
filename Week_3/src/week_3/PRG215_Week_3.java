/*
 * No license,  for PRG215 at University of Phoenix
 */
package week_3;
import java.util.Scanner;

/**
 *
 * @author Paul Barden
 */
public class PRG215_Week_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create the items namesand item costs arrays
        String[] itemNames = {"Tennis Shoes", "Shirts", "Coats", "Belts", "Pants"};
        double[] itemCosts = {45.89, 25.55, 89.99, 15.00, 25.99};

        //variables to for the financial calculations
        double totalAmount = 0.0;
        double taxRate = 0.081;

        //Discounts for large purchases
        double discountRate = 0.025; //2.5%
        double amountToQualifyForDiscount = 100;
        double discountAmount = 0;

        //Displays items for sale on the console
        System.out.println("The following clothing items are available for purchase:");
        for(int i=0; i<itemNames.length; i++) 
        {
            //Display each item in the array
            System.out.println("   " + (i + 1) + ". " + itemNames[i] + " for $" + itemCosts[i] + " each");
        }
        System.out.println("");

        //Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);

        //Display on the console - ask for your customer's name
        System.out.print("Please enter your name: ");

        //Get the customer name from the keyboard and store it in the String object "customerName"
        String customerName = keyboard.next();
        System.out.println("");

        //Display the customer's name and provide instructions
        System.out.println("Ok, " + customerName + ", please enter the product ID (the number to the left of the item name) that you wish to purchase. Enter 0 when you are finished.");

        //Loop until the user enters 0
        int itemID = 0; //Set the condition to 0
        int itemCounter = 1; //No longer the loop condition counter, now used for display
        do //We're using a different type of loop structure now
        {
            //Prompt the user
            System.out.print("Please enter tiem ID number " + (itemCounter) + " (enter 0 to exit)");
            itemID = keyboard.nextInt();

            //If the user has not entered 0, then add to the total
            if (itemID > 0)
            {
                //Add to the total
                totalAmount = totalAmount + itemCosts[itemID - 1];

                //Increment the item display counter
                itemCounter++;
            }
        }
        while (itemID != 0); //Check if exit condition has been met

        //The loop is complete, calculate the discount and taxes and then display the results
        if (totalAmount >= amountToQualifyForDiscount)
        {
            discountAmount = totalAmount + discountRate;
        }
        else
        {
            discountAmount = 0;
        }

        //Calculate the taxes
        double taxAmount = (totalAmount - discountAmount) * taxRate;

        //Display the results
        System.out.println("");
        System.out.println("You selected " + itemCounter + " items to purchase.");
        System.out.println("Your sales total $" + totalAmount);
        System.out.println("Your discount amount is $" + discountAmount);
        System.out.println("Your sales tax is $" + taxAmount);
        System.out.println("The total amount due is $" + (totalAmount - discountAmount + taxAmount));
        System.out.println("");
    }
    
}
