/************************************************************************************
* Program:  PRG/420 Week 5 
* Purpose:  Analyze Java exception handling code
* Programmer:  Iam A. Student         
* Class:       PRG/420       
* Creation Date:  11/03/2017
*************************************************************************************
* Program Summary:   
*	This code includes simple try/catch (exception handling) functionality. 
*       We put some arithmetic code into a "try" block so that we can "catch" an exception
*       that is thrown during the course working through the arithmetic.
*       We need to know specifically what kind of exception we intend to catch.
* 
*       In this example, we suspect that at some point, one of our variables might hold
*       a zero. (In a real-world situation, we might change this code so that a user
*       specifies the variable values, and a user might type in zero.)
*       This is a problem, because we know we are including the division operator. Dividing
*       a number by zero is not possible (mathematically, the result is undefined),
*       so we need to be able to handle an exception of type ArithmeticException.
*       If we had other code in our try block that threw some other kind of exception,
*       our catch block would not handle it. We would need to write another catch block
*       to handle another kind of exception.
************************************************************************************/
package prg420week5_analyzeassignment;


public class PRG420Week5_AnalyzeAssignment {

    public static void main(String args[]){
        int a,b,c;		// We define variables of type integer namned a, b, and c. 
        try {			// We set up the try check block. We will be looking for an invalid value for integer c
             a=3;		// Now we assign values to the variables. 
             b=15;
             c=b/a;		// The result of dividing a number by 0 is undefined. Exception!
             System.out.println("This line will not be executed when a=0 because when a=0, the previous line throws an exception to the catch block.");      
        }
        catch(ArithmeticException e) { // As soon as an exception is thrown in the "try" block, execution of this code begins.
             System.out.println("Catching this exception thrown by the try block: " + e); 
        }
       System.out.println("Execution resumes here after both the try and catch blocks execute.");
    }
} 