package assn3;

/**
 * This class represents the Recipe class, which contains a name, and respective
 * amounts for each ingredient
 *
 * @author Rodrigo Orozco
 * @version 1
 * @see RecipeManagerTest
 * @see RecipeManager
 * @since 17
 */
public class Recipe {
	private String recipeName;
	private float eggs;
	private float yeast;
	private float flour;
	private float sugar;
	private float butter;

	/**
	 * overloaded constructor with all variable
	 * 
	 * @param recipeName the recipe's name
	 * @param eggs how many eggs
	 * @param yeast how much yeast(grams) 
	 * @param flour  how much flour(grams) 
	 * @param sugar how much sugar(grams) 
	 * @param butter how much butter(grams) 
	 */
	public Recipe(String recipeName, float eggs, float yeast, float flour, float sugar, float butter) {
		this.recipeName = recipeName;
		this.eggs = eggs;
		this.yeast = yeast;
		this.flour = flour;
		this.sugar = sugar;
		this.butter = butter;
	}

	/**
	 * @return the recipeName
	 */
	public String getRecipeName() {
		return recipeName;
	}

	/**
	 * @param recipeName the recipeName to set
	 */
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	/**
	 * @return the eggs
	 */
	public float getEggs() {
		return eggs;
	}

	/**
	 * @param eggs the eggs to set
	 */
	public void setEggs(float eggs) {
		this.eggs = eggs;
	}

	/**
	 * @return the yeast
	 */
	public float getYeast() {
		return yeast;
	}

	/**
	 * @param yeast the yeast to set
	 */
	public void setYeast(float yeast) {
		this.yeast = yeast;
	}

	/**
	 * @return the flour
	 */
	public float getFlour() {
		return flour;
	}

	/**
	 * @param flour the flour to set
	 */
	public void setFlour(float flour) {
		this.flour = flour;
	}

	/**
	 * @return the sugar
	 */
	public float getSugar() {
		return sugar;
	}

	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the butter
	 */
	public float getButter() {
		return butter;
	}

	/**
	 * @param butter the butter to set
	 */
	public void setButter(float butter) {
		this.butter = butter;
	}

}
