import java.util.Scanner;

public class ScannerExample {

	public static void main (String []  args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter an integer and press enter ...");
		double number = myScanner.nextDouble();
		System.out.print(number);
		myScanner.close();
	}
}
