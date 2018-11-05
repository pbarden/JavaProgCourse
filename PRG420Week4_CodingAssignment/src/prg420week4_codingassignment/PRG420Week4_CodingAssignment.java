/**********************************************************************
* Program:  PRG/420 Week 4 
* Purpose:     Week 4 Coding Assignment
* Programmer:  TYPE YOUR NAME HERE       
*  Class:       PRG/420       
*  Creation Date:  TYPE TODAY'S DATE HERE
*********************************************************************
*
**********************************************************************
*  Program Summary: This program demonstrates these basic Java concepts:
*     - Creating an array based on user input
*     - Accessing and displaying elements of the array
* 
* The program should declare an array to hold 10 integers.
* The program should then ask the user for an integer.
* The program should populate the array by assigning the user-input integer
* to the first element of the array, the value of the first element + 100 to
* the second element of the array, the value of the second element + 100 to
* the third element of the array, the value of third element + 100 to
* the fourth element of the array, and so on until all 10 elements of the
* array are populated.
* 
* Then the program should display the values of each of the array
* elements onscreen. For example, if the user inputs 4, the output
* should look like this:
* 
* Enter an integer and hit Return: 4
* Element at index 0: 4
* Element at index 1: 104
* Element at index 2: 204
* Element at index 3: 304
* Element at index 4: 404
* Element at index 5: 504
* Element at index 6: 604
* Element at index 7: 704
* Element at index 8: 804
* Element at index 9: 904
***********************************************************************/
package prg420week4_codingassignment;

// We need to import the following library if we want to use the
// Scanner class to get user input.
import java.util.Scanner;

public class PRG420Week4_CodingAssignment {

    public static void main(String[] args) {
        
        // LINE 1. DECLARE AN ARRAY OF INTEGERS
        int[] myArray;

        // LINE 2. ALLOCATE MEMORY FOR 10 INTEGERS WITHIN THE ARRAY.
        myArray = new int[10];
                
        // Create a usable instance of an input device
        Scanner myInputScannerInstance = new Scanner(System.in); 
        
        // We will ask a user to type in an integer. Note that in this practice
        // code  WE ARE NOT VERIFYING WHETHER THE USER ACTUALLY
        // TYPES AN INTEGER OR NOT. In a production program, we would
        // need to verify this; for example, by including
        // exception handling code. (As-is, a user can type in XYZ
        // and that will cause an exception.)
        System.out.print("Enter an integer and hit Return: ");
        
        // Convert the user input (which comes in as a string even
        // though we ask the user for an integer) to an integer
        int myFirstArrayElement = Integer.parseInt(myInputScannerInstance.next());
        
        // LINE 3. INITIALIZE THE FIRST ARRAY ELEMENT WITH THE CONVERTED INTEGER myFirstArrayElement
        myArray[0] = myFirstArrayElement;
        
        // LINE 4. INITIALIZE THE SECOND THROUGH THE TENTH ELEMENTS BY ADDING 100 TO THE EACH PRECEDING VALUE.
        // EXAMPLE: THE VALUE OF THE SECOND ELEMENT IS THE VALUE OF THE FIRST PLUS 100;
        // THE VALUE OF THE THIRD ELEMENT IS THE VALUE OF THE SECOND PLUS 100; AND SO ON.
        for(int i = 1; i < myArray.length; i++) myArray[i] = myArray[i-1] + 100;
        
        // LINE 5. DISPLAY THE VALUES OF EACH ELEMENT OF THE ARRAY IN ASCENDING ORDER BASED ON THE MODEL IN THE TOP-OF-CODE COMMENTS.
        for(int j = 0; j < myArray.length; j++) System.out.println("Element at index " + j + ": " + myArray[j]);

    }
}