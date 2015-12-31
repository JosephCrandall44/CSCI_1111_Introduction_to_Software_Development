import java.util.Scanner;
public class WhileLoop1 {
	public static void main(String[]args) {
	System.out.println("How many repitions?");
	int numberOfTimes = 0;
	int count = 0;
	int pin = 1994;
	int userPin = 0;
	
	Scanner myScanner = new Scanner(System.in);
	numberOfTimes = myScanner.nextInt();
	
	while (count <= numberOfTimes) {
		System.out.println("Hello");
		count ++;
	}
	
	
	while (userPin != pin && count < 3) {
		System.out.println("Enter your Bank account pin");
		userPin = myScanner.nextInt();
		count++;
	}
	System.out.println("Welcome to Your Bank Account");
	}
	

}
