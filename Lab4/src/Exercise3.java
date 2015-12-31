import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
	double one;
	double two;
	System.out.println("Enter the first number...");
	Scanner myScanner = new Scanner(System.in);
	one = myScanner.next().charAt(0);
	System.out.println("Enter the second number...");
	two = myScanner.next().charAt(0);
	myScanner.close();
	
	if (one >= two){
		System.out.println("The first number is larger than the second numebr");
	}
	else if (one <= two){
		System.out.println("The first number is smaller than the second numebr");
	}
	else if (one == two){
		System.out.println("The first number is equal to the second numebr");
	}
	}
	*/
	/*else if ()
	{
		
	}*/
	