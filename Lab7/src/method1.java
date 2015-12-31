import java.util.Scanner;
public class method1 {
public static int number1 = 24;
public static int number2 = 26;
public static void main(String[]args){
	addTwoNumbers ();
}

public static void message () {
		System.out.println("A Message");
	}
	
public static void print(String[]args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string");
	String message = scan.next();
	System.out.println(message);
}
public static int addTwoNumbers () {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first integer");
	int one = scan.nextInt();
	System.out.println("Enter first integer");
	int two = scan.nextInt();
	int total = one + two;
	System.out.println("Sum = " + total);
	return total;
		 
}
public static int constant(){
	int sum;
	sum = number1 + number2;
	System.out.println(sum);
	return sum;
	}
}
	


