/**********************************************************************
*	Program:	Fileinput 
* 	Purpose: 	Demonstrate the coding for file input	
*	Programmer:	Iam A. student			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	XXX			
*	Creation Date:	01/03/2018
*
* Comments:
* This coding example accepts user input from a file using BufferedReader.
* The file which will input data to the program first must be created.  For this example the input file 
* is named "input.txt" .
*
***********************************************************************/
import java.io.*;  	// imports all the classes that are defined in java.io package

public class Fileinput {
    public static void main(String [] args) {

        String fileName = "input.txt";          		// name of the file to open.
        String line = null;				// will reference one line at a time

        try {
            FileReader fileReader = 		            	  //  FileReader reads text file 
                new FileReader(fileName);      		 //   reads in data from the file 

            // always wrap FileReader in BufferedReader  (to verify)
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);      	   	             // verify / display what is read in by the program
            }   
                   bufferedReader.close();              		// close file
   
         }
         catch(FileNotFoundException ex) {		// coding to verify file can be opened
             System.out.println(			// if not open, error message to display
                 "Unable to open file '" + 
                 fileName + "'");                
         }
         catch(IOException ex) {			// exception, when there is an error in reading 
            System.out.println(
                "Error reading file '" 
                 + fileName + "'");                  

         }
    }
 }
