package challenge;
/**
 * Debugging sample
 */
import java.util.Scanner;
/**
 *
 * @author paulb
 */
public class Challenge {
   public static void main(String[] args) {

        //creates keyboard input object
        Scanner myInput = new Scanner(System.in);

        //find the average of a series of numbers
        int count = 0;
        double total = 0;
        System.out.println("Enter a number: ");
        while(myInput.hasNextDouble())
        {
            total += myInput.nextDouble();   
            count++;
            System.out.println("Enter next number or Q to quit: ");
            
            //added this to help troubleshoot
            System.out.println("Total is: " + total);
            System.out.println("Count is: " + count);
        }
        
        //output before calculation
        System.out.println("Total is: " + total);
        System.out.println("Count is: " + count);

        //to find the average, divide the total by the count of items
        double average = total/count;
        System.out.println("Average is: "+ average);

        //  find the average of these three numbers, the output 
        //  should be 5.33 repeated
        double avg = (3.0 + 5.0 + 8.0)/3.0;
        System.out.println("The average is: "+ avg);
        //  find the celsius temp given the fahrenheit temp
        //  when the fahrenheit is 212, the celsius is 100
        int F = 212;
        double C = 5.0/9.0 * (F-32);
        System.out.println("Celsius: " + C);
        
        
    }
}
