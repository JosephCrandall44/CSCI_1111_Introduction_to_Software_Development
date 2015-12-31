import java.util.Scanner;

public class NumberWizard {
	public static final int ANSWER_EVERYTHING = 42; // This is a constant
	public static final int REALLY_BIG = 1000;

	@SuppressWarnings("resource")
	public static void main(String[] args) { // Entry point for our program
		int user_num1; // Declare an integer to store the user's number
		boolean result; // Declare a boolean to store our results in
		Scanner scan; // Declare a Scanner object to read input

		scan = new Scanner(System.in); // Initialize the Scanner object

		// The print outs here are to communicate with the user
		System.out
				.println("NumberWizard is a sophisticated program that will tell you everything you ever wanted to know about numbers!");
		System.out.print("Please enter an integer: "); // Ask the user for a
														// number
		user_num1 = scan.nextInt();// Reads the user's input as an integer, and
									// stores it in user_num1

		// Now begin the tests
		result = (user_num1 == ANSWER_EVERYTHING); // Notice the difference
													// between = and ==
		// This is a Douglas Adams joke... required reading for Computer Science
		System.out
				.println("You number is the answer to life, the universe and everything... "
						+ result);

		// Now you will fill in code to perform the rest of the tests, described
		// in the comments below.

		// Test if the number is even
		result = (user_num1 % 2 == 0);
		{
			System.out.println("Your number is Even..." + result);
		}

		// Test if the number is negative
		result = (user_num1 < 0);
		{
			System.out.println("Your number is Negative... " + result);
		}

		// Test if the number is really big (say, larger than 1000)
		result = (user_num1 > 1000);
		{
			System.out.println("Your number is REALLY BIG..." + result);
		}
		// You should add a new constant for the "really big" number you compare
		// to

		// Now have the user enter a second number
		System.out.print("Please enter an integer: ");
		int user_num2 = scan.nextInt();
		

		// Test if the first minus the second is less than 0
		result = (user_num1 - user_num2 < 0);
		{
			System.out.println("The first minus the second is less than 0..." + result);
		}
		// Test if the first is a multiple of the second
		result = (user_num1 % user_num2 == 0);
		{
			System.out.println("The first is a multiple of the second..." + result);
		}

		// Test if the sum of the two numbers larger than your "really big"
		// number
		result = (user_num1 + user_num2 > REALLY_BIG);
		{
			System.out.println("The sum of the two numbers larger than your really big number..."+ result);
		}
		// Test if the product of the two numbers is larger than your
		// "really big" number
		result = (user_num1 * user_num2 > REALLY_BIG);
		{
			System.out.println("The product of the two numbers larger than your really big number..."+ result);
		}
		
		
		/*
		 * int even = user_num1 % 2; if(even == 0){ System.out.println
		 * ("Your number is Even"); } else { System.out.println
		 * ("Your number is Odd"); }
		 * 
		 * 
		 * if (user_num1 > 0){ System.out.println ("Your number is Possitive");
		 * } else if (user_num1 == 0){ System.out.println
		 * ("Your number is Zero"); }
		 * 
		 * else { System.out.println ("Your number is Negative"); }
		 */

		System.out.println("Thanks for using NumberWizard, Goodbye."); // End of
																		// program
	}
}
