import java.util.Scanner;
public class DigitalRoot{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		System.out.println("This program takes the digital root of an integer.");
		System.out.println("Enter a positive integer: ");
		n = scan.nextInt();
        while (true)
        {
            if (n > 0)
            {
                int dsum = n % 10;
                n /= 10;
                sum += dsum;
            }
            else if (sum > 9)
            {
                int dsum = sum % 10;
                sum /= 10;
                sum += dsum;

            } else if (sum <= 9 ) break;
        }
		System.out.println("The sum of the digits is " + sum);
	}

}