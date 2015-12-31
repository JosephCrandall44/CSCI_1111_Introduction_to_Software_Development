import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		do {
			System.out.println("Are you anoyed yet?");
			answer = scan.next();
		} while (!answer.equals("yes"));
		System.out.println("I thought so!!!!!!!! 8============D ---");

	}
}
