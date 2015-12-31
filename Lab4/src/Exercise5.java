import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
	double age;
	System.out.println("Enter your age");
	Scanner myScanner = new Scanner(System.in);
	age = myScanner.nextDouble();
	myScanner.close();
	
	if (age >= 18){
		System.out.println("You are old enough to buy Tobacco");
	}
	if (age >= 21){
		System.out.println("You are old enough to buy alchol");
	}
	if (age >= 50){
		System.out.println("You are old enough to join AARP, Congratulations for living so long");
	}
	}

