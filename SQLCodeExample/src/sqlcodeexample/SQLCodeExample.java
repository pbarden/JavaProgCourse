/**********************************************************************
*	Program:	SQLcode 	
* 	Purpose: 	To analyze and document JDBC API calls.
*	Programmer:	D. Paul Barden			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	Roland Morales	
*	Creation Date:	9/15/2018	
*
* Comments: The purpose of the JDBC API calls in this program
*           is to retrieve data from a relational database.
*           To complete this assignment, analyze the code and replace
*           the numbered comments as instructed below. 
***********************************************************************/
package sqlcodeexample;


/** 1. THE REASON FOR IMPORTING THE FOLLOWING LIBRARIES IS...
 *  to use the classes provided to construct objects
 *  -Connection is used to establish a connection with a database, execute queries and return results
 *  -DriverManager is used to manage JDBC drivers
 *  -SQLException is used to provide information when database access exceptions occur
 *  I also took the liberty of adding two others, ResultSet and Statement, since they are used
 *  in the code below as well.
 *  -ResultSet holds all of the database results returned
 *  -Statement will execute SQL statements and return results
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLCodeExample {
   public static void main (String[ ] args) {

      try {								
         String host  = "jdbc:mysql://localhost/STUDENT";                            
         String uName = "bsmith"; 
         String uPass = "roxie"; 
   
         /** 2. THE PURPOSE (RESULT) OF THE FOLLOWING API CALL IS...
	 *  a connection should be established to the database using the url and information
	 * and selects an appropriate driver to use from registered drivers
	 */
         Connection conn = DriverManager.getConnection(host, uName, uPass);    
         
         /** 3. THE PURPOSE (RESULT) OF THE FOLLOWING API CALLS IS...
	 *  a Statement object is created to send SQL statements to the database
	 *  used from the above Connection
	 */
         Statement stmt = conn.createStatement();                         
         String sql = "select  Stu_id, Stu_Name from Stu_Class_1";                                       
         ResultSet rs = stmt.executeQuery (sql);                                   
                                         
         System.out.println("Displaying student information: ");     
    
         
         /** 4. THE RESULT OF THE FOLLOWING API CALLS IS...
	 *  proceed forward to the next row from the current row
	 */
         while (rs.next()) {

             System.out.println ("Student id " + rs.getString("Stu_id"));  
             System.out.println (" is associated with student name " + rs.getString("Stu_Name"));  
         }    	                                                               
   
      } 
      /** 5. THE PURPOSE OF THE FOLLOWING CATCH BLOCK IS...  
	*  to catch and display any information about exceptions if they occur
	*  in the above while interacting with the database
	*/
      catch ( SQLException err ) {
         System.out.println(err.getMessage());

      }
   }
}

