package sumthingsup;

/**
 * Example program for PRG420 at University of Phoenix
 * Calculate the sum of (n^2 - n) with limits x and y
 */

import java.util.Scanner;

/**
 * @author D. Paul Barden
 */

public class SumThingsUp {

    public static void main(String args[]) {

        // open the keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Calculate the sum of (n^2 - n)");
        System.out.println("using different loops.");

        // input value for lower bound
        System.out.print("\nPlease set the lower bound: ");
        double x = keyboard.nextFloat();

        // input value for upper bound
        System.out.print("\nPlease set the upper bound: ");
        double y = keyboard.nextFloat();

        // sum using for loop
        double total = 0;
        for(double n = x; n <= y; n++)
        {
            total += ((pow(n, 2)) - n);
        }
        System.out.println("\nFor:\nThe sum is " + total);

        // sum using do-while loop
        double a = x;
        double sumOfA = 0;
        do {
            sumOfA += ((pow(a, 2)) - a);
            a++;
        } while (a <= y);
      System.out.println("\nDo-While:\nThe sum is " + sumOfA);
    }
    
    static double pow(double base, double exponent) {
        double total = base;

        for(int start = 1; start < exponent; start++) {
            total *= base;
        }
        return total;
    }

}