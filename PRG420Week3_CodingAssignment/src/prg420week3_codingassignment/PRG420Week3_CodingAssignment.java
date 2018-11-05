/**************************************************************************************
* Program:     PRG/420 Week 3
* Purpose:     Week 3 Coding Assignment
* Programmer:  D. Paul Barden
* Class:       PRG/420
* Creation Date:  07/29/18
******************************************************************************************
* Program Summary:   For, while, and do-while loops; nested loops
*
* For this assignment, you will add code to create:
*
* a for loop nested inside another for loop
* a while loop
* a do-while loop

*****************************************************************************************/

package prg420week3_codingassignment;

public class PRG420Week3_CodingAssignment {

    public static void main(String[] args) {

    // The following code should print asterisks: 1 on line 1, 2 asterists on line 2,
    // 3 on line 3, 4 on line 4... for as many lines as the variable linesOfAsterisks.
    // To do this, we can use 2 nested for loops. The first for loop is coded for you.
    // You will need to add another for lop, NESTED INSIDE the first, that prints
    // a certain # of asterisks based on the # of times the loop code has been executed.
    // The result should look like this:
    // *
    // **
    // ***
    // ****
    // *****
    // etc.
    int linesOfAsterisks = 5;
    for (int i = 1; i <= linesOfAsterisks; i++) { // for each line...

         // LINE 1. ADD A NESTED FOR LOOP THAT DISPLAYS ONE ASTERISK ON LINE 1, TWO ASTERISKS ON LINE 2, 3 ASTERISKS ON LINE 3, ETC.
         for (int j = 1; j <= i; j++) //ensures that the loop always prints up to the number in the higher for loop without going over
        {
            System.out.print("*"); //prints an asterisk on the console
        }

    System.out.println();
    }

    //////////////////////////////////////////////////////////////////////
    // Add a while or do-while loop that displays the numbers from 10 to 1 in that order, like so:
    // 10
    // 9
    // 8
    // 7
    // ...
    // 1
    //////////////////////////////////////////////////////////////////////


    int num=10;

    //LINE 2. ADD A LOOP THAT DISPLAYS NUMBERS 10 TO 1 IN DECREASING ORDER (HINT: DECREMENT OPERATOR)
    do { //will do this
        System.out.println(num); //prints variable num to the console
        num--; //decrement operator to decreare num by 1 for each iteration
    } while(num >= 1); //as long as variable num is greater than or equal to 1



    ///////////////////////////////////////////////////////////////////////
    // Write a loop that adds 7s one at a time until the sum becomes > 157.
    // Then print out both the sum and the number of 7s that were aded.
    // Write a while or do-while loop, whichever you think is most appropriate.
    //////////////////////////////////////////////////////////////////////////

    int sum = 0;
    int numberOfSevens = 0;

    //LINE 3. ADD ANOTHER LOOP THAT ADDS 7s UNTIL SUM > 157. THEN DISPLAY SUM AND NUMBER OF SEVENS ADDED.
    while(sum <= 157) //while the sum is less than or equal to 157
    {
        sum += 7; //adds 7 to the sum for each iteration
        numberOfSevens++; //adds 1 to the numberOfSevens for each iteration
    }
    System.out.println("The sum is: " + sum); //print the sum to the console
    System.out.println("Number of sevens: " + numberOfSevens); //print the number of sevens to the console
    }

}




