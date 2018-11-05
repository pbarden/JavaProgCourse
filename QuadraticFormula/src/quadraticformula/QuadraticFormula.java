package quadraticformula;
import java.util.Scanner;

public class QuadraticFormula 
{ 
    public static void main(String[] args) 
    {
        //Enables keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Informs user about program purpose
        System.out.println("Given ax^2 + bx + c, this will");
        System.out.println("calculate the value of x.");

        //Declaration of variables
        double a, b, c, disc, root, x1, x2;
        int numa, numb, numc;

        //Collect user variable input
        System.out.println("Enter a value for a:");
        a = keyboard.nextDouble();
        numa = (int)a;
        System.out.println("Enter a value for b:");
        b = keyboard.nextDouble();
        numb = (int)b;
        System.out.println("Enter a value for c:");
        c = keyboard.nextDouble();
        numc = (int)c;

        //Performs calculations based on the Quadratic Formula
        disc = (b * b) - 4.0 * (a * c);
        root =  Math.sqrt(disc);
        x1 = (-b + root) / 2.0;
        x2 = (-b - root) / 2.0;
            
        //Outputs the answers for x
        System.out.println("Given " + numa + "x^2 + " + numb + "x + " + numc);
        System.out.println("x = " + x1 + " , " + x2);
	}
}