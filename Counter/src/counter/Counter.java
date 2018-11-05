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

/**
 *
 * @author paulb
 */
public class Counter {
    //Create the counter value variable
    private int counterValue;
    
    //Set the counter to zero
    public void setCounter() {
        counterValue = 0;
    }

    //Increase the counter by one
    public void increaseCounter() {
        counterValue += 1;
    }

    //Decrease the counter by one
    public void decreaseCounter() {
        if(counterValue >= 0) counterValue -= 1;
    }

    //Accessor method to return counterValue
    public int getCounterValue() {
        return counterValue;
    }

    //Prints counterValue on the console
    public void printCounterValue() {
        System.out.println("The counter is: " + counterValue);
    }
    
}
