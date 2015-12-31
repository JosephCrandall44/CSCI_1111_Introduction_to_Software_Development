import java.util.Scanner;

public class Exercise5 {
	public static final int upper = 69;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int count = 1;

		do {
			System.out
					.println("Guess what number I am thinking about between 1 and 100.");
			number = scan.nextInt();
			count++;
			if (count > 5) {
				System.out
						.println("You have guessed incorrectly to many times, sorry :(");
				break;
			}
		}

		while (number != upper);
		if (count <= 5) {
			System.out.println("You guessed correctly");
		}
	}
}
