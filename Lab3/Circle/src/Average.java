import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int one;
		int two;
		int three;
		int four;
		double Average;
		System.out.println("Average of four integers Program");
		System.out.println("Enter the first integer: ");
		Scanner myScanner = new Scanner(System.in);
		one = myScanner.nextInt();
		System.out.println("Enter the second integer: ");
		two = myScanner.nextInt();
		System.out.println("Enter the third integer");
		three = myScanner.nextInt();
		System.out.println("Enter the fourth integer");
		four = myScanner.nextInt();
		myScanner.close();
		Average = ((one + two + three + four) / 4);
		System.out.println("Average: " + Average);
	}
}