/**********************************************************************
*	Program:	Week 2 Code Assignment	
* 	Purpose: 	Console/file input and output
*	Programmer:	D. Paul Barden 		
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	Roland Morales			
*	Creation Date:	8/23/2018
* 	Comments:  	Fill in code 
*
***********************************************************************/

package oldstartercode;
import java.util.Scanner;
import java.io.FileNotFoundException; //I am used to the convention that you NEVER use wildcard imports and for the sake of memory efficiency only import those packages which are used
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * PLEASE NOTE: I had to make a lot of changes and completely re-organize this code
 * since the assignment was unclear and the code which was provided did NOT make
 * any sense to me. For example, we read and write to different files if we use the
 * code provided; I think it would make more sense to work with the same file.
 * That said, I left this piece the same but the code below should meet the requirements:
 * -Reads file input.txt
 * -Writes file data.txt
 * -Accepts user input
 * -Uses console output
 */

public class OldStarterCode {
    public static void main(String[] args) {
        // prompts and accepts user input
        Scanner input = new Scanner(System.in); //opens the Scanner for using keyboard
        double data; //stores a number as type double for later use
        System.out.println("Enter numeric value "); //provides instruction to the user
        
        data = input.nextDouble(); //captures the next double entered by user
        
        // accepts file input
        String fileName = "input.txt";                  // name of the file to open
        String line = null;				// will reference one line at a time

        try {
            FileReader fileReader = 		         //  FileReader reads text file 
            new FileReader(fileName);      		 //   reads in data from the file 

            BufferedReader myBufferedReader = new BufferedReader(fileReader); //added a buffered reader to verify

            while((line = myBufferedReader.readLine()) != null) {
                System.out.println(line);      	   	             // displays the file contents by line
            }   
                myBufferedReader.close();              		// close file
        }
        catch(FileNotFoundException e2) { //this will catch the exception thrown when the file cannot be found
            System.out.println("File not found.");
        }
        catch(IOException e) { //this will catch the exception thrown when there is an i/o error
            System.out.println("Input error: file could not be opened.");
        } 
        
        try {						// coding block to output data to file
            PrintStream fileStdout = new PrintStream(new FileOutputStream("data.txt")); // output file name is data.txt

            System.out.println("==============");      // output to console,  numbers up through "data"
            for(int i = 0; i <= data; i++) fileStdout.println("" + i);

        }
        catch(FileNotFoundException e3) { //thrown by FileOutputStream
            System.out.println("File was not found.");
        }
        
    }
}