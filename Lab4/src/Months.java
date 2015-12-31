import java.util.Scanner;
public class Months {
	public static void main(String[] args) {
	int card;
	System.out.println("Enter an Integer between 1 and 12");
	Scanner myScanner = new Scanner(System.in);
	card = myScanner.nextInt();
	myScanner.close();
	if (card == 1){
		System.out.println("January");
	}
	else if (card == 2){
		System.out.println("February");
	}
	else if (card == 3){
		System.out.println("March");
	}
	else if (card == 4){
		System.out.println("April");
	}
	else if (card == 5){
		System.out.println("May");
	}
	else if (card == 6){
		System.out.println("June");
	}
	else if (card == 7){
		System.out.println("July");
	}
	else if (card == 8){
		System.out.println("Agust");
	}
	else if (card == 9){
		System.out.println("September");
	}
	else if (card == 10){
		System.out.println("October");
	}
	else if (card == 11){
		System.out.println("November");
	}
	else if (card == 12){
		System.out.println("December");
	}
	else {
		System.out.println("Error: the value is not in the range [1,12]");
	}
	}
	}
