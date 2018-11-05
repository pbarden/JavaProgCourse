/************************************************************************************
* Program:  PRG/420 Week 5 
* Purpose:     Week 5 Coding Assignment
* Programmer:  D. Paul Barden        
* Class:       PRG/420       
* Creation Date:  8/12/2018
*************************************************************************************
* Program Summary:   
*	This program converts a given date to a string.    
*     	The code includes exception handling for a ParseException. 
************************************************************************************/

package prg420week5_codingassignment;

import java.util.*;     // wildcard to import all the util. classes 
import java.text.*;     // wildcard to import all the text classes   

public class PRG420Week5_CodingAssignment {

    public static void main(String[] args){

    // The getInstance() method returns a Calendar object whose calendar fields have been initialized with the current date and time.
    Calendar calendar = Calendar.getInstance(); {

    //LINE 1. BEGIN THE TRY BLOCK.
        try { // obviously this begins the "try" block, this runs before the "catch" block. generally this is used to execute a procedure in order to find and fix errors before progressing into another portion of the program. this one in particular makes a date string, formats it, and prints it to the console. if the String str_date is 'unparseable', the data will not be able to be used in the operation and will throw the ParseException exception e
                String str_date="01-Nov-17"; // Declare a string that we will use later to format a date like this: ##-XXX-##
                DateFormat formatter;  // Declare an object of type DateFormat so that we can call its parse() method later
                Date myFormattedDate; // Declare a variable of type Date to hold the formatted date
                
                formatter = new SimpleDateFormat("dd-MMM-yy");    // Assign a specific date format to the formatter variable

                // The given date is taken as a string that is converted into a date type by using 
                // the parse() method 

                 myFormattedDate = (Date)formatter.parse(str_date);      	// setting up the format
                
                System.out.println("The formatted date is " + myFormattedDate);
                System.out.println("Today is " +calendar.getTime() );
            
        }

        //LINE 2. WRITE THE CATCH BLOCK TO CATCH EXCEPTIONS OF TYPE ParseException (TO HANDLE EXCEPTION, SIMPLY PRINT THE EXCEPTION)

        catch(ParseException e) { //this begins the catch block, which is run after the try block. this one in particular will catch the ParseException that might be generated in the above try block, such as if you changed the month to another word or left off the month
            System.out.println(e.toString()); //the toString() method is inherited by the Exception class, this just converts the exception generated to a String and prints it to the console using the println() method
        }
  
    }
  }
}