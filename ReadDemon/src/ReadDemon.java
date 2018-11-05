/*
* This is my first program!
* (c) Paul Barden 2018
*/

import java.util.Scanner;

public class ReadDemon {
	public static void main(String[] args) {
		int numberOfBooks, pagesPerBook, totalPages;
                
		System.out.println("Enter the number of Books you own: ");
		Scanner keyboard = new Scanner(System.in); 
	        numberOfBooks = keyboard.nextInt(); 
		System.out.println("Enter the number of Pages in each book.");
		pagesPerBook = keyboard.nextInt(); 
		
		totalPages = numberOfBooks * pagesPerBook;
		
                System.out.println("If you have " + pagesPerBook + " pages per book");
                System.out.println("and you own " + numberOfBooks + " books, then");
		System.out.println("you have read a total of " + totalPages + " pages.");
		
		if (10000 < totalPages)
			System.out.println("You are a Read Demon!");
		else
			System.out.println("Please visit your local library!");
	}
}