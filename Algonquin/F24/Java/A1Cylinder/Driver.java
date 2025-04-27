/*
 * Author: Rodrigo Orozco Morales
 * Lab Professor: Leanne Seaward
 * Due Date: October 6, 2024
 * Last Modified : October 4, 2024
 * Description: A simple program to calculate the total volume of cake-like 
 * cylindrical pyramid with three layers given radius and height by user 
 */

import java.util.Scanner;

//Main method class
public class Driver {

	public static void main(String[] args) {

		// Declarations
		double radius = 0;
		double height = 0;
		double volume1 = 0;
		double volume2 = 0;
		double volume3 = 0;
		double totalVolume = 0;

		Scanner input = new Scanner(System.in);

		// Input items
		System.out.print("Please enter the base cylinder radius ");
		radius = input.nextDouble();
		System.out.print("Please enter the base cylinder height ");
		height = input.nextDouble();

		// calculate the three layers' respective volume by creating a cylinder
		// object and calling upon calculateVolume method
		Cylinder cylinder1 = new Cylinder(radius, height);
		volume1 = cylinder1.calculateVolume();
		Cylinder cylinder2 = new Cylinder(radius * 0.8, height);
		volume2 = cylinder2.calculateVolume();
		Cylinder cylinder3 = new Cylinder(radius * 0.8 * 0.8, height);
		volume3 = cylinder3.calculateVolume();

		// calculate and output the final volume
		totalVolume = volume1 + volume2 + volume3;
		System.out.printf("The total volume of your cylindrical pyramid is %.3f%n", totalVolume);
		System.out.println("Program by Rodrigo Orozco Morales");
	}
}
