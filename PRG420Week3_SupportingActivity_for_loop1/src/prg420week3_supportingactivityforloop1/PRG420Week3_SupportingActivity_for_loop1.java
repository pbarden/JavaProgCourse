package prg420week3_supportingactivityforloop1;
import java.math.*;
import java.util.Scanner;

public class PRG420Week3_SupportingActivity_for_loop1{

    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 10;
    public static int total;

    public static void main(String args[]) {

        System.out.println("Before the the loop.");
        System.out.println("My substrings".substring(3, 12)); //output: "substring"
        System.out.println("\"A quote within a string.\"");
        System.out.printf("%,d", 123456789);

        System.out.printf("\n%.1f gallon(s) = %.5f liter(s)\n", 1.0, 3.78541);
        
        

        Scanner myKeyboard = new Scanner(System.in);

        int myInt = myKeyboard.nextInt();
        double myDouble = myKeyboard.nextDouble();
        float myFloat = myKeyboard.nextFloat();
        String myString = myKeyboard.nextLine();

        for(int x = LOWER_BOUND; x <= UPPER_BOUND; x++)  {
          
            System.out.println("In the loop, and the current value of x is: " + x );
            total += (int) Math.sqrt(3 - (x * 2));
        }
      
        System.out.println("After the loop.");
        System.out.println("The sum is " + total);
    }   
}