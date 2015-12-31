import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int reverse = 0;
		int remainder = 0;

		System.out.println("This program reverses the order of the digets in an integer");
		System.out.println("Enter a two or more diget integer");
		n = scan.nextInt();
		 do{
			 	remainder = n % 10;
	            reverse = reverse* 10 + remainder;
	            n = n / 10;


		 }while (n > 0);
		System.out.println("The reversal of the integer is " + reverse);

	}
}
