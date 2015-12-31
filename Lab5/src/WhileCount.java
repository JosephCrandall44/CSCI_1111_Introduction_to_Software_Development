import java.util.Scanner;

public class WhileCount {

	public static void main(String[] args) {

		String answer;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			if (count >= 3) {
				System.out.println("You have exceeded the number of tries allowed");
				break;
			}
			
			System.out.println("What is the capital of Moracco? Enter one option");
			System.out.println("1. Tangiers");
			System.out.println("2. Rabat");
			System.out.println("3. Casablanca");
			System.out.println("4. Marrakech");
			answer = scan.next();
			count ++;
			
			if (answer.equals("Rabat")) {
				System.out.println("Your answer is correct!");
				break;
			}
		}

	}

}
