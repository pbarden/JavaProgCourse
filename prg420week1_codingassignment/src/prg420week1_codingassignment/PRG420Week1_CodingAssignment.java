/**********************************************************************
*	Program:	 PRG420Week1_CodingAssignment	
* 	Purpose: 	 Week 1 Individual Assignment #2	
*	Programmer:	 Dennis Paul Barden		
*	Class:		 PRG/420			
*	Creation Date:	 7/12/2018
*********************************************************************
*
**********************************************************************
*	Program Summary: This program asks the user for a one-word name
*                        and then displays a constructed greeting
*                        that looks like this: 
*
*                        Hello, NAME!
**********************************************************************/

package prg420week1_codingassignment; //tells the compiler to include this file in the package called "prg420week1_codingassignment"

/**
 *
 * @author dpb
 */


import java.util.Scanner; //imports class and methods, this one in particular deals with input

public class PRG420Week1_CodingAssignment { //same as the file name, contains methods for the class "PRG420Week1_CodingAssignment"; public means the methods within can be accessed by anything
    
    public static void main(String[] args) { //static means the methods contained belong to the entire class, void means it doesn't return a specific type of data (otherwise would be declared as such), main means it is the main entry point for the program which Java looks for automatically, string[] args constructor takes the arguments passed in basically tells the main method be read, must open brackets then the code goes inside
        // Create a usable instance of an input device    
        Scanner keyboard = new Scanner(System.in); //Scanner is the object class and keyboard is the instance object of that class declared here, new says to make this an object of Scanner type using with the parameter System.in which will listen for input

        // Prompt user for input
        System.out.print("Please enter your first name: "); //calls the print method of out from System with the String passed in, which will output to the console

        // Capture first word and assign it to A VARIABLE
        String userName = keyboard.next(); //Declares object of type String called userName and assigns it a value of the next keyboard input from the object keyboard using method next() which captures the next word input

        // Construct the greeting 
        System.out.println("\nHello, " + userName + "!"); //same as above except with the println() method, used \n to skip to the next line and make it easier to read on the console, the + is used to concatenate two Strings around the userName object which, in this case, stored the text entered above

    } //always close your braces after you finish defining a class, else you may run into errors compiling
    
}
