package testvalueprogram;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ClsValue
{
    private final int MinAcceptedValue;
    private final int MaxAcceptedValue;

    public ClsValue (int min, int max) {
        MinAcceptedValue = min;
        MaxAcceptedValue = max;
    }

    public int getValue()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean numberIsSet = false;
        int n = 0;
        
        do {            
            try{
                System.out.println();
                System.out.print("Enter an integer value: ");
                n = keyboard.nextInt();
                if(n < MinAcceptedValue)
                {
                    throw new CustomOutOfRangeException("Too low! Try again.");
                }
                if(n > MaxAcceptedValue)
                {
                    throw new CustomOutOfRangeException("Too high! Try again.");
                }
                if(n >= MinAcceptedValue && n <= MaxAcceptedValue)
                {
                    numberIsSet = true;
                }
            }
            catch (InputMismatchException ex2)
            {
                System.out.println("Please enter an integer.");
                keyboard.nextLine();
            }
            catch(CustomOutOfRangeException ex1)
            {
                    System.out.println(ex1.getMessage());
            }
        } while (numberIsSet == false);
        
        return n;
    }

    public void output(int iNum)
    {
        System.out.println();
        System.out.println("The given integer is " + iNum);
    }
}