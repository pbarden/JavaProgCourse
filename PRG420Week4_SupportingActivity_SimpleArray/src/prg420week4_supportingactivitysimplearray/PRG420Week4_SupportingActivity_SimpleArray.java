/************************************************************************************
* Program:     PRG/420 Week 4 
* Purpose:     Week 4 Supporting Activity--Simple Array
* Programmer:  Iam A. Student         
* Class:       PRG/420       
* Creation Date:  10/28/17
*************************************************************************************
* Program Summary:  This program creates an array with elements (values) and then
* accesses and displays those array values using the enhanced for statement.
* In addition, this program demonstrates the syntax necessary to access and display
* a specific element using the index [] notation.
************************************************************************************/

package prg420week4_supportingactivitysimplearray;

public class PRG420Week4_SupportingActivity_SimpleArray {
   
/* In the "main" method declaration below, the keyword static means that the method 
    is associated with the class.  The keyword "void" means that the method has no return value;
    in other words, calling the main() method (which is what the compiler does) will not return
    any value.
 */
     public static void main(String[] args){		

         // In the first atement, we will declare the array and load a few elements.
         // Because we are loading 6 elements at the same time we are declaring
         // the array, the compiler will automatically allocate memory for 6 integer elements.
         // We do not need to specify the integer "6" explicitly.
         int[] myFirstArray = {10,14,36,41,21,45};   
                  		
         // Below you see the "enhanced for" statement designed to make iterating through
         // collections and arrays easier.  The syntax is "for (int item : numbers)" 
         // and you can find out more about it here: 
         // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
         for (int i:myFirstArray){      // This enhanced "for" statement simplifies syntax for accessing arrays.
                                        // It means "for every integer in the array myFirstArray"
             System.out.println(i);     // Display each element on its own line.

         }
         System.out.println("The value of myFirstArray[0] is " + myFirstArray[0]);
     }
 } 
