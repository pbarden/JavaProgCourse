/**********************************************************************
*	Program:	Demo 	
* 	Purpose: 	Basic coding to demonstrate console input	
*	Programmer:	Iam A. student			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	XXX			
*	Creation Date:	01/02/2018	
*
* Comments:
* This coding example accepts user input from the console. 
*
***********************************************************************/
package demo;
import java.util.Scanner;    	// scanner is a predefined class for taking inputs from user

public class Demo 
{
 
public static void main(String[] args)
 {

//  scanner creates a way to let user interface with the program
Scanner input= new Scanner(System.in);

// define the variable data as double, to use for the  inputted value
double data;

System.out.println("Enter Demo Dollar Amount");  	// ask user for a dollar amount 
data= input.nextDouble();		   	 	// dollar amount is stored	

System.out.println (data);			    // display from the console.
   
}						 // end of the main

}
