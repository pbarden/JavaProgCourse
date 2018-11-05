import java.util.Scanner;
		
public class MagicScanner {
    public static void main(String[] args) {
	double x, y, z;
			
	Scanner keyboard = new Scanner(System.in);
				
	System.out.println("Enter a value for x:");
	x = keyboard.nextDouble();
	y = (int)x;
		
	System.out.println("x is " + x);
	System.out.println("y is " + y);
				
	z = (byte)x;
				
	System.out.println("x is " + x);
	System.out.println("z is " + z);
    }
}