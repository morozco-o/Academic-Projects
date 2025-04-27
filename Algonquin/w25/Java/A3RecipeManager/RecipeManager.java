package assn3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * File name: RecipeManager.java
 * Author: Rodrigo Orozco, 041106665
 * Course: CST8284
 * Assignment: Assignment3
 * Date: 2025-03-30
 * Professor: Leanne Seaward
 * Purpose: Program for creating an interactive display of managing a given 
 * recipe list and making shopping list from recipes
 */

/**
 * This class represents the Managing class which intakes a file and builds a
 * list of Recipe objects to manage
 *
 * @author Rodrigo Orozco
 * @version 1
 * @see RecipeManagerTest
 * @see Recipe
 * @since 17
 */
public class RecipeManager {
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	private List<String> orderType = new ArrayList<>();
	private List<Integer> orderAmount = new ArrayList<>();
	private float yeastTotal = 0;
	private float eggTotal = 0;
	private float flourTotal = 0;
	private float sugarTotal = 0;
	private float butterTotal = 0;

	{
		try {
			// input file into Java
			File myFile = new File("recipelist1.txt");
			Scanner myReader = new Scanner(myFile);
			// Checks that file doesn't end
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine().trim();
				// Stores recipe name if line begins with such
				if (line.startsWith("Recipe ")) {
					String name = line.substring(7).trim();
					// stores respective amount of each ingredient
					float eggs = 0, yeast = 0, flour = 0, sugar = 0, butter = 0;
					for (int i = 0; i < 5; i++) {
						if (myReader.hasNextLine()) {
							String[] parts = myReader.nextLine().split(" ");
							if (parts.length == 2) {
								float value = Float.parseFloat(parts[1]);
								switch (parts[0]) {
								case "eggs":
									eggs = value;
									break;
								case "yeast":
									yeast = value;
									break;
								case "flour":
									flour = value;
									break;
								case "sugar":
									sugar = value;
									break;
								case "butter":
									butter = value;
									break;
								}
							}

						}
					}
					recipes.add(new Recipe(name, eggs, yeast, flour, sugar, butter));
				}
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while inputing file");
			e.printStackTrace();
		}
	}

	/**
	 * Display's a list of all recipes
	 */
	public void displayRecipes() {
		System.out.println("Available Recipes:");
		for (int x = 0; x < recipes.size(); x++) {
			System.out.println(x + ". " + recipes.get(x).getRecipeName());
		}
	}

	/**
	 * Creates a list based on user's choice of bread and amount
	 */
	public void createList() {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int breadAmount;
		while (true) {
			try {
				System.out.println("Which bread would you like?");
				choice = input.nextInt();
				// if within range of possible recipes
				if ((choice <= recipes.size()) && (choice >= 0)) {
					break;
				} else {
					System.out.println("Please type a valid number.");
					input.nextLine();
				}
			} catch (InputMismatchException e) {
				System.out.println("Please only type digits.");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("How much of this bread would you like");
				breadAmount = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Please only type digits.");
				input.nextLine();
			}
		}

		orderType.add(recipes.get(choice).getRecipeName());
		orderAmount.add(breadAmount);

		yeastTotal += recipes.get(choice).getYeast() * breadAmount;
		eggTotal += recipes.get(choice).getEggs() * breadAmount;
		flourTotal += recipes.get(choice).getFlour() * breadAmount;
		sugarTotal += recipes.get(choice).getSugar() * breadAmount;
		butterTotal += recipes.get(choice).getButter() * breadAmount;

	}

	/**
	 * Prints the total shopping list of ingredients based on prior creation to a
	 * text file
	 */
	public void printList() {
		Scanner input = new Scanner(System.in);
		for (int x = 0; x < orderType.size(); x++) {
			System.out.println(orderAmount.get(x) + " " + orderType.get(x) + " Loaf(ves)");
		}

		System.out.println("You will need a total of:");
		if (yeastTotal > 0) {
			System.out.println("yeast " + yeastTotal + " grams");
		}
		if (eggTotal > 0) {
			System.out.println("egg(s) " + eggTotal);
		}
		if (flourTotal > 0) {
			System.out.println("flour " + flourTotal + " grams");
		}
		if (sugarTotal > 0) {
			System.out.println("sugar " + sugarTotal + " grams");
		}
		if (butterTotal > 0) {
			System.out.println("butter " + butterTotal + " grams");
		}

		System.out.println("Do you want to save this list (Y/n)?");
		String choice = input.nextLine();

		if (choice.toUpperCase().equals("Y")) {
			// What writes the file (similar display but printing to file not system
			try (PrintWriter writer = new PrintWriter(new File("shoppinglist.txt"))) {
				for (int x = 0; x < orderType.size(); x++) {
					writer.println(orderAmount.get(x) + " " + orderType.get(x) + " Loaf(ves)");
				}

				writer.println();
				writer.println("You will need a total of:");
				if (yeastTotal > 0) {
					writer.println("yeast " + yeastTotal + " grams");
				}
				if (eggTotal > 0) {
					writer.println("egg(s) " + eggTotal);
				}
				if (flourTotal > 0) {
					writer.println("flour " + flourTotal + " grams");
				}
				if (sugarTotal > 0) {
					writer.println("sugar " + sugarTotal + " grams");
				}
				if (butterTotal > 0) {
					writer.println("butter " + butterTotal + " grams");
				}
				System.out.println("Shopping list saved to shoppinglist.txt!");
			} catch (IOException e) {
				System.out.println("Error saving shopping list: " + e.getMessage());
			}
		}

	}

}
