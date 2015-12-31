import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int x = 0;
		int fx = x * x;
		int gx = (38 * x) + 100;

		while (fx < gx) {
			x++;
			fx = x * x;
			gx = (38 * x) + 100;
		}
		System.out.println("f(x) = " + x);

	}
}
