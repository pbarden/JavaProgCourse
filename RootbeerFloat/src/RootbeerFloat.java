import java.util.Scanner;
		
public class RootbeerFloat {
    public static void main(String[] args) {
	float x, y, z, a;
			
	Scanner keyboard = new Scanner(System.in);
			
	System.out.println("Enter a value for x: ");
	x = keyboard.nextFloat();
	y = (float) (1.0 / x);
	z = (float) x * y;
	a = (float) z - 1;
				
	System.out.println("The values stored are:");
	System.out.println("x: " + x);
	System.out.println("y: " + y);
	System.out.println("z: " + z);
       	System.out.println("a: " + a);
    }
}