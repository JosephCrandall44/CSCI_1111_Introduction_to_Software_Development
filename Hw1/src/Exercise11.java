import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		int n = 0;
		int x;
		do {
			System.out.println("Enter a Poitive Integer");
			n = scan.nextInt();
		} while (n < 0);
		x = n*n;
		System.out.println("The Square of " + n + " = " + x);

	}
}