import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pin = 1449;
		int userpin;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Enter your pin");
			userpin = scan.nextInt();
			
		} while (pin !=userpin);
		
		System.out.println("Please choose an option");
		
		
		

	}

}
