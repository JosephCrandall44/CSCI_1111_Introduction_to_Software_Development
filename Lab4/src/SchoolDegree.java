import java.util.Scanner;

public class SchoolDegree {
	public static void main(String[] args) {
	int StartYear;
	int CurrentYear;
	System.out.println("Enter the year you started your Degree ");
	Scanner myScanner = new Scanner(System.in);
	StartYear = myScanner.nextInt();
	CurrentYear = 2014;
	myScanner.close();
	
	if (CurrentYear - StartYear == 0){
		System.out.println("You have not completed your Freshamn Year.");
	}
	else if (CurrentYear - StartYear == 1){
		System.out.println("You are a Freshman.");
	}
	else if (CurrentYear - StartYear == 2){
		System.out.println("You are a Softmore.");
	}
	else if (CurrentYear - StartYear == 3){
		System.out.println("You are a Junior.");
	}
	else if (CurrentYear - StartYear == 4){
		System.out.println("You are a Senior!");
	}
	else if (CurrentYear - StartYear < 0){
		System.out.println("You have not started your degree.");
	}
	else if (CurrentYear - StartYear > 4){
		System.out.println("You have finished your degree.");
	}
	}
}
