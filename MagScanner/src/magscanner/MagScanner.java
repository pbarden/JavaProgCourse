package magscanner;

import java.util.Scanner;

/*
* by Paul B
*/
		
public class MagScanner {
    public static void main(String[] args) {
	double num1, num2, num3;
			
	Scanner keyboard = new Scanner(System.in);
				
	System.out.println("Enter your first number:");
        num1 = keyboard.nextDouble();
        System.out.println("Enter your next number:");
        num2 = keyboard.nextDouble();
        num3 = num1 + num2;
		
	System.out.println("the first number is " + num1);
	System.out.println("the second number is " + num2);
	System.out.println("the sum of these numbers is " + num3);
    }
}