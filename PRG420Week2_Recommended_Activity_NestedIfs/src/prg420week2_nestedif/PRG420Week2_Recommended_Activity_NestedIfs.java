/**********************************************************************
* Program:     PRG/420 Week 2 
* Purpose:     Week 2 Enrichment Assignment (Recommended)
* Programmer:  Iam A. Student         
* Class:       PRG/420       
* Creation Date:  10/19/17
*********************************************************************
*
**********************************************************************
* Program Summary: 
* The coding demonstrates the use of the nested if-then-else code lines to find the largest of 3 numbers. 
* In the coding of the program, the assigned values of the variables are already defined. 
* However, in a real world application, you would typically gert these values
* from user input, an input file, a form submission, etc.
*
* Note the use of the "is greater than or equal to" comparison operator >= in the if condition.
* Note, too, the use of if-then-else that allows us to do something (in this case, nest an if statement)
* based on the results of another comparison.
**********************************************************************/
package prg420week2_nestedif;

class PRG420Week2_Recommended_Activity_NestedIfs{
    
   public static void main(String[] args) {       
   //   The program execution always starts with main() function. 
   //   It must be declared public so that you can run it in NetBeans (i.e., so that it is publicly available).

      // Here we are declaring three different variables, n1, n2, and n3 of type Double
      // and assigning them values right away--all on the same line of code.
      // Some programmers prefer to do it this way, but we could also have
      // broken out each variable declaration/assignment on a separate line, if we thought
      // that would be eaiser to read and maintain.
      Double n1 = 61d, n2 = 4.5, n3 = -50.3, largestNumber;       
      
      // If the first number is greater than or equal to the second number, then 
      // check to see if the first number is also greater than the third number.
      // If so, we know that the first number is the greatest of all three, so
      // assign largestNumber = n1.
      
      if (n1 >= n2) {              // The �if� code lines determines the range of values to check.  
         if (n1 >= n3) {
           largestNumber = n1;     // Will set the largest number to the value found in the �if� line. 
         }
         // If the first number is greater than or equal to the second number,
         // but the first number is NOT greater than or equal to the third number,
         // then we know that the third number must be bigger than the first--and is, in fact,
         // the largest number. So assign largestNumber = n3.
         else {
           largestNumber = n3;   //  If the above lines did find the largest number, the else line will 
			         //	determine the value of  n3 (-5.3). 
         }
      }
      
      // If we are here, then the first number is less than the second number...
      else {	       // When the above  � if � lines   do not find the correct range of values, the   
                                            // program will check another range.
         // And if the second number is larger than the third number, set largestNumber = n2.
         if (n2 >= n3) {                    // A new range of values is set.
           largestNumber = n2; 
         }
         // Otherwise, if the first number is less than the second number and also less than the third
         // number, then the largest number must be the third number. so set largestNumber = n3.
         else {                          // When the value does not match the above range of values  
           largestNumber = n3;           //  Then the else line will determine the largest number. 
         }
      }

      System.out.println("Largest number is " + largestNumber);     // Print the largest number found in the search.
   }
}

