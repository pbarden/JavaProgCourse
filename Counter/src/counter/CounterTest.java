/**
* Define a class called Counter. An object of this class is used to count things, 
* so it records a count that is a nonnegative whole number. Include methods to set 
* the counter to 0, to increase the count by 1, and to decrease the count by 1. Be 
* sure that no method allows the value of the counter to become negative. Also 
* include an accessor method that returns the current count value, as well as a 
* method that displays the count on the screen. Do not define an input method. The 
* only method that can set the counter is the one that sets it to zero. Write a 
* program to test your class definition. (Hint: You need only one instance variable.)
*/

package counter;

import counter.Counter;
import java.util.Scanner;

/**
 *
 * @author paulb
 */
public class CounterTest {

    public static void main(String[] args) {
        //Creates a new Counter to test the Counter class
        Counter newCounter = new Counter();
        
        //Shows the initial value of the counter
        newCounter.getCounterValue();

        //Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);

        //User decides to increase or decrease counter
        System.out.println("Would you like to increase the counter?");
        System.out.println("Enter the amount to increase the counter:");
        int userNumber1 = keyboard.nextInt();
        
        //Loop to increase the counter by userNumber
        for(int n=0; n < userNumber1; n++) {
            newCounter.increaseCounter();
        }
        newCounter.printCounterValue();

        System.out.println("Would you like to decrease the counter?");
        System.out.println("Enter the amount to decrease the counter:");
        int userNumber2 = keyboard.nextInt();

        //Loop to decrease the counter by userNumber
        for(int n=0; n < userNumber2; n++) {
            newCounter.decreaseCounter();
        }
        newCounter.printCounterValue();

    }
    
}