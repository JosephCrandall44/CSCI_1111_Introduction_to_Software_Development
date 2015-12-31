import java.util.Scanner;
public class Numbers{
	public static void main(String[] args) {
	int integer;
	System.out.println("Enter an Integer: ");
	Scanner myScanner = new Scanner(System.in);
	integer= myScanner.nextInt();
	myScanner.close();
	
	if (integer == 0){
		System.out.println("The value input is zero");
	}
	else if (integer > 0){
		System.out.println("The value input is greater than zero");
	}
	else if (integer < 0){
		System.out.println("The value input is less than zero");
	}
	}
}