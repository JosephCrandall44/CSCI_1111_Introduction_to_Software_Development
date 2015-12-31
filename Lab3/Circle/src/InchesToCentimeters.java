import java.util.Scanner;

public class InchesToCentimeters {

	public static void main(String[] args) {
		double Feet;
		double Inches;
		double Centimeters;
		double FC;
		double IC;
		System.out.println("This program converts feet and inches to centimeteres.");
		System.out.println("Enter the Number of Feet...");
		Scanner myScanner = new Scanner(System.in);
		Feet = myScanner.nextDouble();
		System.out.println("Enter the Number of inches...");
		Inches = myScanner.nextDouble();
		myScanner.close();
		FC = (30.48 * Feet);
		IC = (2.54 * Inches);
		Centimeters = (FC + IC);
		System.out.println(Feet + "ft " + Inches + "in = " + Centimeters + "cm");
	}
}

