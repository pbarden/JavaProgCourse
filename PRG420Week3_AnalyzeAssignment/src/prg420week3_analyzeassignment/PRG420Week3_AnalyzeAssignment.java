/**************************************************************************************
* Program:     PRG/420 Week 3 
* Purpose:     Week 3 Analyze Assignment 
* Programmer:  D. Paul Barden        
* Class:       PRG/420       
* Creation Date:  07/29/18
******************************************************************************************
* Program Summary:   For, while, and do-while loops
* 
* This program demonstrates the syntax for the for, while, and do-while loops. It also
* contains comments that explain why a programmer would use a for loop over a while or do-while
* loop.
*
* Notice the increment operator (i++) and also notice the copious use of println() statements.
* Using System.out.println() is an excellent way to debug your code--especially if your loop code
* is giving unexpected results.
*****************************************************************************************/


package prg420week3_analyzeassignment;

public class PRG420Week3_AnalyzeAssignment {

    private static final double TAX_RATE = 0.08;
    private static double grandTotal = 0;
    private static double dollars = 1;

    public static void main(String[] args) {
        
        // for loops are a good choice when you have a specific number of values
        // you want to iterate over and apply some calculation to.
        System.out.println("FOR LOOP - Here are the taxes on all 10 prices:");
        
        for (dollars = 1; dollars <= 10; dollars++) {
            CalculateFees();
        }
        Reset();
        
        // while loops are a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // while loops MAY OR MAY NOT EVER EXECUTE, depending on the counter value.
        System.out.println("\n\nWHILE LOOP - Here are the taxes on prices less than $5:");
        while (dollars < 5) {
            CalculateFees();
            dollars++;
        }
        Reset();
        
        // do-while loops are also a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // do while loops ALWAYS EXECUTE AT LEAST ONCE, no matter what the counter value.
        // For example, in the code below, we want to print out the tax only on those 
        // amounts smaller than $1.  But because we're using the do-while loop, the code
        // will execute the body of the loop once before it even checks the condition! So
        // we will get an INCORRECT PRINTOUT.
        
        System.out.println("\n\nDO-WHILE LOOP - Here are the taxes on prices less than $1:");
        
        do {
            CalculateFees();
            dollars++;
        } while (dollars < 1);
    }

    public static void CalculateFees()
    {
        grandTotal = dollars * TAX_RATE;
        System.out.printf("\nThe tax on $%.2f is $%.2f", dollars, grandTotal);
    }

    public static void Reset()
    {
        dollars = 1;
    }
}