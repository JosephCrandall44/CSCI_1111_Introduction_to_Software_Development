import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		System.out.println("Enter an integer greater than 0");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j<=i; j++){
			System.out.print(i);
		}
			System.out.println();
}
	}
}