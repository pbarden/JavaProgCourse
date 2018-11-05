import java.util.Scanner;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
                
                System.out.println("Enter the number of Baskets you have.");
		Scanner keyboard = new Scanner(System.in); 
                numberOfBaskets = keyboard.nextInt(); 
                System.out.println("Enter the number of Eggs you have in each basket.");
                eggsPerBasket = keyboard.nextInt(); 
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}