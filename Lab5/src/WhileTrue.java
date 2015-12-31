import java.util.Scanner;

public class WhileTrue {

	public static void main(String[] args) {

		String answer;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("What is the capital of Moracco? Enter one option");
			System.out.println("1. Tangiers");
			System.out.println("2. Rabat");
			System.out.println("3. Casablanca");
			System.out.println("4. Marrakech");
			answer = scan.next();

			if (answer.equals("Rabat")) {
				System.out.println("Your answer is correct!");
				break;
			}
		}

	}

}
