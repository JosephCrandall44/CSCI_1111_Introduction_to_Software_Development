import java.util.Scanner;
public class Exercise12 {
public static void main(String[] args){ 
	
	Scanner myScanner = new Scanner(System.in);
	
	
	
	
	int count = 0; 
	int option; 
	double x = 0;
	double y = 0;
	double sum = 0;
	double difference = 0;
	double product = 0;
	double quotient = 0;
	
	do {
	System.out.println("Welcome to your calculator."); 
	
	System.out.println("please enter you first number");
	x = myScanner.nextDouble();
	System.out.println("please enter you second number");
	y = myScanner.nextDouble();
		System.out.println("Choose an option.");
		System.out.println("1. Add.");
		System.out.println("2. Subtract.");
		System.out.println("3. Multipy.");
		System.out.println("4. Divide.");
		System.out.println("5. Exit.");
		option = myScanner.nextInt(); 
		switch (option) {
		case 1:
			sum = (x + y);
			System.out.println(sum ); 
			System.out.println(); break;
		case 2: 
			difference = (x - y);
			System.out.println(difference); 
			System.out.println(); break;
		case 3:
			product = (x * y);
			System.out.println(product); 
			System.out.println(); break;
		case 4:
			quotient = (x / y);
			System.out.println(quotient); 
			System.out.println(); break; 
		case 5: 
			System.out.println("Have a nice day.");
			count = 5; break; }
		} while (option != 5); 
		
}
}
