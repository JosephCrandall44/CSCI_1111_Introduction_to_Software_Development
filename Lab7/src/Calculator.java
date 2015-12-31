import java.util.Scanner;

public class Calculator {
	public static double add(double x, double y) {
		double sum;
		sum = x + y;
		return sum;
	}

	public static double subtract(double x, double y) {
		double sum;
		sum = x - y;
		return sum;
	}

	public static double multiply(double x, double y) {
		double sum;
		sum = x * y;
		return sum;
	}

	public static double divide(double x, double y) {
		double sum;
		sum = x / y;
		return sum;
	}

	public static void main(String[]args) {

		int results;
		double answer;
		Scanner scan = new Scanner(System.in);
		
		do {
		

		System.out.println("enter first number");
		double x = scan.nextDouble();
		System.out.println("enter second number");
		double y = scan.nextDouble();

		System.out.println("Pick a function");
		System.out.println("1: add");
		System.out.println("2: subtract");
		System.out.println("3: mulitply");
		System.out.println("4: divide");
		System.out.println("5: exit");

		results = scan.nextInt();
		if (results > 5){
			break;
		}
		
		switch (results) {
		case 1:
			answer = add(x, y);
			System.out.println(answer);
			break;
		case 2:
			answer = subtract(x, y);
			System.out.println(answer);
			break;
		case 3:
			answer = multiply(x, y);
			System.out.println(answer);
			break;
		case 4:
			answer = divide(x, y);
			System.out.println(answer);
			break;
		case 5:
			break;
		}

		} while (results != 5);

		
	}
}
