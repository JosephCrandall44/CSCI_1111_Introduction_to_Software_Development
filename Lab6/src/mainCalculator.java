import java.util.Scanner;

public class mainCalculator {

	public static int add(int x, int y){
		int sum;
		sum = x+y;
		return sum;
	}
	
	public static int subtract(int num1, int num2) {
		
		int difference;
		difference = num1-num2;
		return difference;
	}
	public static void main(String[]args){
		int results;
		int subtraction;
		
		Scanner scan = 	new Scanner(System.in);
		int a;
		int b;
		System.out.println("enter your first integer");
		a = scan.nextInt();
		System.out.println("enter your second integer");
		b = scan.nextInt();
		
		results = add(a,b);
		subtraction = subtract (a,b);
		System.out.println(subtraction);
		
		
	}

}
