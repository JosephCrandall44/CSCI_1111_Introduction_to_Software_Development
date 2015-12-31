import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		String test;
		String upper = "";
		int i;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string, this program will switch ever other charater to upper case starting at character 2: ");
		test = scan.next();

		for (i = 1; i < test.length(); i++) {
			if (i % 2 == 0) {
				upper += test.substring(i, i + 1).toUpperCase();
			} else {
				upper += test.substring(i, i + 1);
			}	
		}
		System.out.println(upper);
	}
}
