/**********************************************************************
* Program:  PRG/420 Week 2 
* Purpose:     Week 2 Supporting Activity (decision constructs) 
* Programmer:  Iam A. Student         
*  Class:       PRG/420       
*  Creation Date:  10/18/17
*********************************************************************
*
**********************************************************************
*  Program Summary: This program demonstrates these basic Java concepts:
*                           - defining variables of different types
*                           - if-then and if-then-else logic
*                           - switch logic
***********************************************************************/

package prg420_week2_supportingactivity;


public class PRG420Week2_AnalyzeAssignment {

   public static void main(String args[]) {
              
     // Example of if-then logic.
     // If a condition is true, do something. If it is not true, do nothing.
     
     boolean iAmHappy = true; // We can set a boolean variable to true or false (no quotes around either)
     if (iAmHappy != false) {  // We could also have said "iAmHappy == true" here and gotten the same result.
         System.out.println("if-then example: I am happy today!"); 
     }
     
     // Example of if-then-else logic.
     // If a condition is true, do something. If it is not true, do something else.
   
     int num = 50;          // The num variable is set to 120
     if( num < 50 ) {        // Since 120 is NOT less than 50
		             //  the compiler will skip the next line and go directly to "else"  		 
             System.out.println("if-then-else example: num " + num + " is less than 50"); }
     else  {               // Since 120 is greater than 50, the next code line will print.
              System.out.println("if-then-else example: " + num + " is greater than or equal to 50");
     }
     
     // Example of switch logic.
     // If a condition involving one of several pre-defined values is met, do something.
     // If the value contains none of the pre-defined values, do something else (typically display an error).
     
     int numDayOfWeek = 8; // Declare numDayOfWeek and assign it 3, meaning the third day of the week
     String dayString;     // Declare a variable of type String to hold the name of the day
     switch (numDayOfWeek) {   // Examine the value of numDayOfWeek variable
         case 1: dayString = "Monday"; // If numDayOfWeek is 1, then it must be Monday
                 break;
         case 2: dayString = "Tuesday"; // If numDayOfWeek is 2, then it must be Thursday
                 break;
         case 3: dayString = "Wednesday"; // etc.
                 break;
         case 4: dayString = "Thursday";
                 break;
         case 5: dayString = "Friday";
                 break;
         case 6: dayString = "Saturday";
                 break;
         case 7: dayString = "Sunday"; // There are only 7 days in a week, but we will add the default case
                 break;                // to handle unexpected data. In this example, we are setting numDayOfWeek in our code, but
                                       // in a real program it would come from somewhere else--and might be < 1 or > 7 for all we know.
         default: dayString = "Error! There are exactly 7 days in a week";
                 break;
     }
     System.out.println("switch example: Starting with Monday as day 1, the day of the week for " + numDayOfWeek + " is " + dayString + ".");
   }
   
   
}

