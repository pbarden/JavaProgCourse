import java.util.Scanner; 
public class SyntaxError { 
	public static void main(String[] args) { 
		System.out.println("Multiply two whole numbers.");
		Scanner keyboard = new Scanner(System.in); 
            int n1 = keyboard.nextInt(); 
            int n2 = keyboard.nextInt(); 
		int product = n1 * n2; 
		System.out.println("The product is " + product); 
	} 
}