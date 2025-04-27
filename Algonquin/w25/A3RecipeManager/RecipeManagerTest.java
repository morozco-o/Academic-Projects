package assn3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class represents the Driver class to utilize the Recipe Manager's
 * methods
 *
 * @author Rodrigo Orozco
 * @version 1
 * @see RecipeManager
 * @see Recipe
 * @since 17
 */
public class RecipeManagerTest {

	public static void main(String[] args) {
		RecipeManager manager = new RecipeManager();
		int selection;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\nWelcome to Rodrigo's recipe manager");
			System.out.println("Please select one of the following options");
			System.out.println("1. Show available recipies.");
			System.out.println("2. Create Shopping List.");
			System.out.println("3. Print Shopping List.");
			System.out.println("4. Quit Program");
			System.out.println("0. to reprint this menu.");

			// Validation of proper input
			while (true) {
				try {
					System.out.print("Enter a number: ");
					selection = input.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Please only type digits.");
					input.nextLine();
				}
			}

			System.out.println("");

			switch (selection) {
			// Show all available recipes
			case 1:
				manager.displayRecipes();
				break;
			case 2:
				// Add to shopping list
				manager.createList();
				break;
			case 3:
				// Print out current shopping list
				manager.printList();
				break;
			case 4:
				// Exit menu
				System.out.println("Goodbye!");
				return;
			// Reprints options
			case 0:
				break;
			// if wrong input
			default:
				System.out.println("Valid input are digits from 0 to 4");
				break;
			}

		}
	}
}
