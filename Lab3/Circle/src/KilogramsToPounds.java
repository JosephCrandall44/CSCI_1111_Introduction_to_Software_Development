import java.util.Scanner;

public class KilogramsToPounds {

	public static void main(String[] args) {
		double PoundsR;
		double Pounds;
		double OuncesR;
		double Ounces;
		double Kilograms;
		System.out.println("This Program Converts kilograms to Pounds and Ounces");
		System.out.println("Enter the numbers of Kilograms: ");
		Scanner myScanner = new Scanner(System.in);
		Kilograms = myScanner.nextDouble();
		myScanner.close();
		PoundsR = (Kilograms * 2.2);
		OuncesR = (PoundsR % 1);
		Ounces = (OuncesR * 16);
		Pounds = (PoundsR - OuncesR);
		
		System.out.println(Kilograms + "kg" + " = " + Pounds + "lb " + Ounces + "oz");
	}
}