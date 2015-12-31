import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
	char one;
	char two;
	System.out.println("Enter the first Character...");
	Scanner myScanner = new Scanner(System.in);
	one = myScanner.next().charAt(0);
	System.out.println("Enter the second Character...");
	two = myScanner.next().charAt(0);
	myScanner.close();
	
	if (one == two){
		System.out.println("The Characters are the same");
	}
	else {
		System.out.println("The Characters are not the same");
	
	}

