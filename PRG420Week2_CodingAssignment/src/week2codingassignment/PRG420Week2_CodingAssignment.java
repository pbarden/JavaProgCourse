/**********************************************************************
* Program:  PRG/420 Week 2 
* Purpose:     Week 2 Coding Assignment
* Programmer:  Dennis Paul Barden        
*  Class:       PRG/420       
*  Creation Date:  07/22/2018
*********************************************************************
*
**********************************************************************
*  Program Summary: This program demonstrates these basic Java concepts:
*                           - defining variables of different types
*                           - if-then and if-then-else logic
*                           - constructing a string to display onscreen
*                           - switch logic
*
* To complete this assignment, you will add code where indicated. The
* behavior of your completed assignment should be to accept an input
* value for the number of sides of a two-dimensional figure. Based on that value, 
* your code should display the type of figure that corresponds to the number of polygon angles
* indicated (3=triangle, 4=rectangle, etc.)
*
* Here are the specific requirements:
*
* After the user types in a value from 3 to 5 inclusive (i.e., 3, 4, or 5):
*
* 1. Your code determines whether the input value is out of range (less than 3 or more than 5)
* and, if so, displays a meaningful error message on the screen and ends the program.
*
* 2. Because you will be comparing a single expression (the input value) to multiple constants (3, 4, and 5),
* your code should use a switch statement to display the following message onscreen:
*
*     If user inputs 3, onscreen message should say "A triangle has 3 sides."  
*     If user inputs 4, onscreen message should say "A rectangle has 4 sides."
*     If user inputs 5, onscreen message should see "A pentagon has 5 sides."
*
* 3. Be sure to test your program. This means running your program multiple
* times with test values 3, 4, 5, as well as at least two values that fall outside that range
* (one lower than the lowest and one higher than the highest) and making sure
* that the correct message displays for each value you input. Also be sure
* that running your program does not cause any compiler errors.
***********************************************************************/
package week2codingassignment;

import java.util.Scanner;

public class PRG420Week2_CodingAssignment {

    // Declare variables to hold the boundaries of number of angles
    private static final int MIN_NUM_ANGLES = 3;
    private static final int MAX_NUM_ANGLES = 5;

    public static void main(String[] args) {
               
        String userInputStringOfAngles;  // Declare a variable of type String to capture user input
        int numberOfAngles; // Declare a variable of type int to hold the converted user input
        String myResult = " "; // Declare String variable to hold the end result

        Scanner myInputScannerInstance = new Scanner(System.in); // Recognize the keyboard
        System.out.print("Please type the integer 3, 4, or 5 and then press Enter: "); // Prompt the user
        userInputStringOfAngles= myInputScannerInstance.next(); // Capture user input as string
        numberOfAngles = Integer.parseInt(userInputStringOfAngles); // Convert the string to a number in case this will be useful later
        
        // LINE 1. CODE TO DETERMINE WHETHER USER INPUT IS OUT OF BOUNDS GOES HERE

        if(numberOfAngles < MIN_NUM_ANGLES || numberOfAngles > MAX_NUM_ANGLES) System.out.println("Error: Number entered is out of bounds."); // Checks to see if numberOfAngles is a number within the defined MIN and MAX values

        // LINE 2. SWITCH CODE TO PRINT CORRECT "SHAPE" MESSAGE BASED ON USER INPUT GOES HERE

        switch(numberOfAngles) {
            case 3: myResult = "A triangle has 3 sides."; // if numberOfAngles is 3, set this string to myResult
            break; //break out of the switch statement so the rest of the switch block doesn't run
            case 4: myResult = "A rectangle has 4 sides."; // if numberOfAngles is 4, set this string to myResult
            break; //break out of the switch statement so the rest of the switch block doesn't run
            case 5: myResult = "A pentagon has 5 sides."; // if numberOfAngles is 5, set this string to myResult
            break; //break out of the switch statement so the rest of the switch block doesn't run
        }

        System.out.println(myResult); // Prints the result on the console

    }

}