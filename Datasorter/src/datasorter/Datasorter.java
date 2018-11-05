/*
 * Program: Datasort 
 * Purpose: Individual: Week Three Coding Assignment
 * Programmer: D. Paul Barden			
 * Class: PRG/421, Java Programming II			
 * Instructor: Roland Morales			
 * Creation Date: 08/31/2018	
 *
 * Comments:
 * For this assignment, you will develop "starter" code. After you finish, your 
 * code should access an existing text file that you have created, create an
 * input stream, read the contents of the text flie, sort and store the contents
 * of the text file into an ArrayList, then write the sorted contents via an
 * ouput stream to a separate output text file.
 */
package datasorter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class Datasorter {
 
    public static void main (String [] args) throws FileNotFoundException, IOException  { //added throws for exceptions which are not directly handled by the program
    
        File fin = new File("in.txt");      // input file
        File fout = new File("out.txt");   // create an out file
        
        // Java FileInputStream class obtains input bytes from a file
        FileInputStream fis = new FileInputStream(fin);
        FileOutputStream fos = new FileOutputStream(fout); //added FileOutputStream object since file will be created later in the program
        
        // buffering characters so as to provide for the efficient reading of characters, arrays, and lines
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos)); //also wrapped the output stream in a BufferedWriter

        // declare an array in-line, ready for the sort
        String aLine;
        ArrayList<String> al = new ArrayList<String> ();
        
        int i = 0;
        while ((aLine = in.readLine()) != null) {

            // will sort all values included where length is greater than 0
            if (aLine.trim().length() > 0) { //only includes lines read when aLine has a length of more than 0 (ensures that blank lines aren't written to the new file)
                al.add(aLine); //adds String stored in aLine to ArrayList 'al'
                i++; //added this line to help keep count of the total items
                    }
            }


        Collections.sort(al);    // sorted content to the output  file
        {
            for (String s : al) { // must declare variable 's', use for loop to repeat this for each String in the ArrayList 'al'
                System.out.println(s); //prints the data to the console
                out.write(s); //writes the String to the file
	        out.newLine(); //adds a new line to the file (necessary if more data will be writen to the file and keeps all data separate on new lines)
        }
        // close the 2 files
        in.close(); //closes the BufferedReader object 'in'
	out.close(); //closes the BufferedReader object 'out'
        }
    }

}