import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		
		System.out.println("Enter a string, this program will count the number of vowles: ");
		System.out.println("Enter how characters would you like in the string");
		Scanner scan = new Scanner(System.in);;
		
		int set = scan.nextInt();
		char[] character = new char[set];
		for (int i = 0; i < set; i++) {
			System.out.println("Enter a character");
			character[i]=scan.next().charAt(0);
		}
System.out.println(character);
	}
}
