import acm.util.*;
import java.util.*;

public class Exercise_6 {
	private static final int NUMBER_OF_QUESTIONS = 5;

	public static int Question() {
		RandomGenerator rgen = new RandomGenerator();
		int a;
		int b;
		boolean operation;
		operation = rgen.nextBoolean();
		if (operation == true) {
			while (true) {
				a = rgen.nextInt(0, 20);
				b = rgen.nextInt(0, 20);
				if ((a + b) <= 20) {
					System.out.println("What is " + a + " + " + b + "?");
					int sum = (a + b);
					return sum;
				}
			}

		}
		if (operation == false) {
			while (true) {
				a = rgen.nextInt(0, 20);
				b = rgen.nextInt(0, 20);
				if ((a - b) <= 20 && (a - b) >= 0) {
					System.out.println("What is " + a + " - " + b + "?");
					int difference = (a - b);
					return difference;
				}

			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			int answer = Question();
			int count = 0;
			boolean right = false;
			do {
				int response = myScan.nextInt();
				if (response == answer) {
					System.out.println("Right!");
					right = true;
					break;
				} else  if (count !=2){
					System.out.println("Wrong! Try Again.");
				}
				count++;

			} while (count < 3);
			if (right == false) System.out.println("No the answer is " + answer + ".");
		}
		myScan.close();
	}

}
