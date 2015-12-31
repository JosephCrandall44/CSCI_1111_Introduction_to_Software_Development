import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
	int card;
	System.out.println("Enter an Integer between 1 and 13");
	Scanner myScanner = new Scanner(System.in);
	card = myScanner.nextDouble();
	myScanner.close();
	
	if (card == 1){
		System.out.println("You card is an Ace");
	}
	else if (card == 2){
		System.out.println("You card is a two");
	}
	else if (card == 3){
		System.out.println("You card is a three ");
	}
	else if (card == 4){
		System.out.println("You card is a four");
	}
	else if (card == 5){
		System.out.println("You card is a five");
	}
	else if (card == 6){
		System.out.println("You card is a six");
	}
	else if (card == 7){
		System.out.println("You card is a seven");
	}
	else if (card == 8){
		System.out.println("You card is a eight");
	}
	else if (card == 9){
		System.out.println("You card is a nine");
	}
	else if (card == 10){
		System.out.println("You card is a ten");
	}
	else if (card == 11){
		System.out.println("You card is a jack");
	}
	else if (card == 12){
		System.out.println("You card is a queen");
	}
	else if (card == 13){
		System.out.println("You card is a king");
	}
	}
