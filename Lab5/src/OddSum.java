import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int total = 0;
		System.out.println("Please enter a positive integer");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			if (n == 1) {
				System.out.println(1);
			} else {
				total = total + ((i * 2) + 1);
			}
		}System.out.println (total);
	}
}
/*
 * first atempt
 * int x = 0; int y = 0; int n = 0; int sum = 0; System.out.println
 * ("PLease enter a positive integer"); n = scan.nextInt(); for (x = 1; x <=
 * n; x++) { if (n == 1) { System.out.println(1); break; } else { sum = sum
 * + (x * 2) + 1; System.out.println (sum); } }
 * 
 * }
 */

