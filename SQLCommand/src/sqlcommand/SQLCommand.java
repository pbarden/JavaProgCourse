/********************************************************************** 
*Program:        PRG282Week5CodeAssignment_startercode.java  
* Purpose:       Starter code to access two tables via JDBC. 
* Programmer:    YOUR NAME GOES HERE
* Class:         PRG/421r13, Java Programming II 
* Instructor:    YOUR INSTRUCTOR'S NAME GOES HERE
* Creation Date: TODAY'S DATE GOES HERE
* 
* CommentS:      The purpose of this code is to access a relational
*                database (MySQL), query two joined tables, and
*                process the results of the query. For this assignment,
*                no heavy-duty processing is required; we will simply
*                examine the returned data and display a selected
*                portion of it on the console.  
***********************************************************************/ 
package sqlcommand; 
 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
 
public class SQLCommand  { 
    public static void main (String[ ] args)  { 
 
        try {    		    // start of the try/catch block of code
           String host  = "jdbc:mysql://localhost:3306/";   // This value is provided in the instructions for this assignment.                             
           String uName = "student";   // This value is provided in the instructions for this assignment.   
           String uPass = "prg421";   // This value is provided in the instructions for this assignment.  

        Connection conn = DriverManager.getConnection(host, uName, uPass);                      
        Statement stmt = conn.createStatement();                          

        // Select values from the tables 
        String sql = "select  Emp id, FName, LName, Addr, City, State, Zip from Employee_table, Union, select Paysch, 401k, Spouse from Payroll-table;";                                                                                  
        ResultSet rs = stmt.executeQuery (sql);            // cursor pointing to its current row of data                        

        System.out.println ("Displaying student information: ");        // display values from the tables

        String Emp_id = rs.getString("Emp id");                     
        String FName = rs.getString("FName "); 
        String LName = rs.getString("LName "); 
        String Addr = rs.getString("Addr ");
        String Zip = rs.getString("Zip");
        String Paysch = rs.getString("Paysch ");
        String _401k = rs.getString("401k");
        String Spouse = rs.getString("Spouse");

        String Stu_id = "9036205752";
        String Stu_Name = "Dennis Paul Barden";

        System.out.println (Stu_id  + ",  " +Stu_Name );        
        System.out.println (Emp_id  + ",  " +FName  + ",  " +LName  + ",  " +Addr  + ",  " +Zip  + ",  " +Paysch  +",  " +_401k + ",  "+Spouse);                                                                       

                   }     
        catch ( SQLException err ) { 
            System.out.println( err.getMessage(  )  ); 

        } 

    } 
 
} 
