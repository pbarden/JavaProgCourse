/************************************************************************************
* Program:  PRG/420 Week 4 
* Purpose:     Week 4 AnalyzeAssignment
* Programmer:  Iam A. Student         
* Class:       PRG/420       
* Creation Date:  10/28/17
*************************************************************************************
* Program Summary:  Creating and sorting an array
* The coding example demonstrates the Arrays.sort() method, which you can learn
* more about here: http://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
*************************************************************************************/

package prg420week4_analyzeassignment;

import java.util.*; // import the java utilities classes which we will need to sort our array

public class PRG420Week4_AnalyzeAssignment {

    public static void main(String args[]) {     
        int[ ] arraynum;	 // Declare arraynum as an array of integers (int).
        arraynum = new int[8];	 // Now create space in arraynum for 8 elements of type integeger.
        arraynum[0] = 5;  	 // Load some integer values in the array.
        arraynum[1] = 10;        // In a real-life program, we would probably
        arraynum[2] = 15;        // get our values from a user or input file.
        arraynum[3] = 11;        // We are loading values like this so you can focus
        arraynum[4] = 1;         // on how arrays work.
        arraynum[5] = 2;  
        arraynum[6] = 3;  
        arraynum[7] = 4;  
        
        //////////////////////// Display the elements BEFORE sorting
        System.out.println("Here is the order in which array elements were created:");
        for (int j=0; j < arraynum.length; j++) {
            System.out.println("The value of arraynum[" + j + "] is " + arraynum[j]);
        }

        Arrays.sort(arraynum);		// Send our arraynum array to be sorted in ascending order by the sort() method
        int i;				// Define the counter for the loop. We can do it this way or inside
                                        // the for loop, as we did in the preceding for loop.

        //////////////////////// Display the elements AFTER sorting
        System.out.println("\nHere is the order of array elements AFTER sorting:"); // The \n means newline (for formatting)
        for (i=0; i < arraynum.length; i++) {	// Loop, starting at 0 and adding 1 each time, until counter is less than array length. 		
              System.out.println("The value of arraynum[" + i + "] is " + arraynum[i]);  // print the numbers
        
        }
        
    }
}    