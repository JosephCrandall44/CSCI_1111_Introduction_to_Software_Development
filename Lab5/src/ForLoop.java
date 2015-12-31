import java.util.Scanner;
public class ForLoop {

	private static Scanner newScan;

	public static void main(String[] args){
		int numberOfTimes;
		System.out.println("How many times do you want to repeate on screen");
		newScan = new Scanner(System.in);
		numberOfTimes = newScan.nextInt();
		for (int count = 0; count < numberOfTimes; count++){
			System.out.println("Have a nice day");
			System.out.println("It's a good day");
		}
		System.out.println("Thanks");
	}
}
