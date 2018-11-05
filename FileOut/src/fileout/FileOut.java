/**********************************************************************
*	Program:	FileOut	
* 	Purpose: 	Demonstrate the coding to produce output to a file.   
*	Programmer:	 I am student			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:				
*	Creation Date:	01/03/2018	
*
***********************************************************************/
package fileout;  
import java.io.*;  


public class FileOut {

    public static void main(String[] args) {  
           
        InputStream istream;  
        OutputStream ostream=null;  
	// FileOutputStream creates an OutputStream that you can use to write bytes to a file.
        int c;  					//  character stream	
        final int EOF = -1;  				// EOF indicator
        istream = System.in;  

        
        // If the Data.txt file already exists, present its contents on the console.
        String fileName = "Data.txt";          		// name of the file to open.
        String line = null;				// will reference one line at a time

        try {
            FileReader fileReader = 		         //  FileReader reads text file 
                new FileReader(fileName);      		 //   reads in data from the file 

            // always wrap FileReader in BufferedReader  (to verify)
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            System.out.println("Here are the contents of the current file named " + fileName + ":\n");
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
        
       
        // Now, let's construct a new file containing user input.
        System.out.println("\nType characters to write to file. After you finish, press Ctrl+Shift+Del to end.");  
        File outFile =  new File("Data.txt");           	// create a new file 
               
        try {  					// try block for EOF indicator  
            ostream = new FileOutputStream(outFile);  
            while ((c = istream.read()) != EOF)  	// look for end of file in istream  
                ostream.write(c);  
        } catch (IOException e) {  
            System.out.println("Error: " + e.getMessage());  
        } finally {  
            try {  					// try block for file error – file did not close

                istream.close();  			// close input and output
                ostream.close();  
              } catch (IOException e) {  
                System.out.println("File did not close");  
           }  
        }  
    }  
}  

