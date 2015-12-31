import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		String str;
		int sum = 0;
		System.out
				.println("Enter a string, this program will count the number of vowles: ");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a')
			|| (str.charAt(i) == 'e')
			|| (str.charAt(i) == 'i') 
			|| (str.charAt(i) == 'o')
			|| (str.charAt(i) == 'u') 
			|| (str.charAt(i) == 'A')
			|| (str.charAt(i) == 'E')
			|| (str.charAt(i) == 'I')
			|| (str.charAt(i) == 'O')
			|| (str.charAt(i) == 'U'))
				sum++;		
		}
		System.out.println(" The String contains " + sum + " vowels." );
	}
}
