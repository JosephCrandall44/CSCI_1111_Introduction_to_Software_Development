import java.util.Scanner;

public class convertKilometersToMiles {

	public static void main(String[] args) {
		double kilometers;
		double miles;
		System.out.println("Enter the Number of Kilometers...");
		Scanner myScanner = new Scanner(System.in);
		kilometers = myScanner.nextDouble();
		myScanner.close();
		miles = (0.6214 * kilometers);
		System.out.println(kilometers + " Km is equivalent to " + miles + " miles");
	}
}
