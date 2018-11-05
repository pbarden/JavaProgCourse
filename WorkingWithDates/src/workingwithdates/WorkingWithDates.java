/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithdates;

/**
 *
 * @author paulb
 */

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class WorkingWithDates {

    public static void main(String[] args) {

        System.out.println("Local date is " + LocalDate.now());

        System.out.println("Local time is now " + LocalTime.now());

        System.out.println("Local time and date is: " + LocalDateTime.now());

        LocalDate date = LocalDate.now();

        DayOfWeek myDayOfWeek = date.getDayOfWeek();

        System.out.println("Here is what day of the week it is: " + myDayOfWeek);

    }
}