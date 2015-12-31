import java.util.Scanner;

public class Exercise11 {
		public static boolean isPrime(int n)
		{
		int i = 2;
		 
		if (n == 2) {
		return true ;   
		}
		 
		while (i <  n) {
		if (n % i == 0) {
		return false;
		}
		i++;
		}
		 
		return true;
		}

	public static void main(String[] args) {
		System.out.println("Enter an integer to check if it is prime");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		boolean answer = isPrime(x);
		System.out.println (answer);
	}
}
