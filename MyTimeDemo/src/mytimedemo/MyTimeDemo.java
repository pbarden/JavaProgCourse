/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytimedemo;

import java.time.*;
import java.util.Scanner;

public class MyTimeDemo {

    public static void main(String[] args) {

        System.out.print("Please enter a month: ");
        
        Scanner reader = new Scanner(System.in);
        int monthEntered = reader.nextInt();

        System.out.print("Please enter a day: ");
        int dayEntered = reader.nextInt();
        
        System.out.print("Please enter a year: ");
        int yearEntered = reader.nextInt();
        
        LocalDate a = LocalDate.of(yearEntered, monthEntered, dayEntered);
        System.out.println("Date is a " + a.getDayOfWeek().name());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        
        LocalDate b = LocalDate.now();

        LocalDate.now().compareTo(a);

        if(a.isAfter(b)){System.out.println("Date entered is after today.");
        }else if(a.isBefore(b)){System.out.println("Date entered is before today.");
        }else if(a. isEqual(b)){System.out.println("You entered today's date.");
        }else{System.out.println("Invalid input. Please try again.");
        }

    }
}