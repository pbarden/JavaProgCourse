package week_2;

import java.util.Scanner;

/**
 *
 * @author Paul Barden
 * for PRG215
 * University of Phoenix
 */
public class PRG215_Week_2 {

    public static void main(String[] args) {
    
        //Create the costs of items to be sols
        double tennisShoeCost = 45.89;
        double shirtCost = 25.55;
        double coatCost = 89.99;
        double beltCost = 15.00;
        double pantCost = 25.99;
        
        //Variables to store financial information
        double totalAmount = 0.0;
        double taxRate = 0.081;
        
        //Display items for sale on the console
        System.out.println("The following clothing items are available for purchase:");
        System.out.println("   1. Tennis Shoes for $" + tennisShoeCost + " each");
        System.out.println("   2. Shirts for $" + shirtCost + " each");
        System.out.println("   3. Coats for $" + coatCost + " each");
        System.out.println("   4. Belts for $" + beltCost + " each");
        System.out.println("   5. Pants for $" + pantCost + " each");
        System.out.println("");

        //Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);

        //Display on the console - ask for the customer's name
        System.out.print("Please enter your name: ");

        //Get the customer name from the keyboard and store it in the String object "customerName"
        String customerName = keyboard.next();
        System.out.println("");

        //Ask the customer for how many items they wish to purchase - going to use this number for a loop exit condition
        System.out.print("How many of the above items do you wish to purchase? ");

        //Get the number of items from the keyboard
        int itemsToPurchase = keyboard.nextInt();
        System.out.println("");

        //Display the customer's name and the number of items they wish to purchase on the console using println()
        System.out.println("Ok, " + customerName + ", you wish to purchase " + itemsToPurchase + " items.");

        //Instructions to the user
        System.out.println("Please enter the product ID (the number to the left of the item name) that you wish to purchase.");

        //Loop the number of times the customer entered for the number of items
        for(int loopCounter = 0; loopCounter < itemsToPurchase; loopCounter++) {

            //Promote the user and get item number from keyboard
            System.out.print("Please enter item ID number " + (loopCounter + 1) + ": ");
            int itemID = keyboard.nextInt();

            //Test which item the user entered
            //User enetered 1
            if(itemID == 1)
            {
                totalAmount = totalAmount + tennisShoeCost;
            }

            //User entered 2
            if(itemID == 2)
            {
                totalAmount = totalAmount + shirtCost;
            }

            //User entered 3
            if(itemID == 3)
            {
                totalAmount = totalAmount + coatCost;
            }

            //User entered 4
            if(itemID == 4)
            {
                totalAmount = totalAmount + beltCost;
            }

            //User entered 5
            if(itemID == 5)
            {
                totalAmount = totalAmount + pantCost;
            }
        }

        //The loop is complete, calculate the taxes and display the results
        double taxAmount = totalAmount * taxRate;

        //Show the results
        System.out.println("");
        System.out.println("Your sales total $" + totalAmount);
        System.out.println("Your sales tax is $" + taxAmount);
        System.out.println("The total amount due is $" + (totalAmount + taxAmount));
        System.out.println("");
    }
}