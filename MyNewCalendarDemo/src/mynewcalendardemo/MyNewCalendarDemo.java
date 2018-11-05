/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynewcalendardemo;

/**
 *
 * @author paulb
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
        
public class MyNewCalendarDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the month: ");
        
        Scanner reader = new Scanner(System.in);
        int monthEntered = reader.nextInt();

        System.out.print("\nPlease enter the day: ");
        int dayEntered = reader.nextInt();
        
        System.out.print("\nPlease enter the year: ");
        int yearEntered = reader.nextInt();
        
        LocalDate a = LocalDate.of(yearEntered, monthEntered, dayEntered);
        System.out.println(a.getDayOfWeek().name());
        
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        System.out.println(formattedDate);
    }
    
}
