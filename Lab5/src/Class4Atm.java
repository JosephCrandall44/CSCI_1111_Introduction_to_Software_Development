import java.util.Scanner; 
public class Class4Atm {
public static void main(String[] args){ 
	
	Scanner myScanner = new Scanner(System.in);
	
	
	int PIN = 1449; 
	int userPIN; 
	int option; 
	double balance = 50; 
	double withdraw;
	int count = 0; 
	
	System.out.println("Hello. Welcome to Citibank."); 
	do { 
	System.out.println("Please enter your PIN number."); 
		userPIN = myScanner.nextInt();
		
	if (userPIN == PIN) {
		do {
		System.out.println("Welcome to Citibank."); 
		System.out.println("Choose an option.");
		System.out.println("1. Balance Inquiry.");
		System.out.println("2. PIN Change.");
		System.out.println("3. Deposit Money.");
		System.out.println("4. Withdrawl Money.");
		System.out.println("5. Exit.");
		option = myScanner.nextInt(); 
		switch (option) {
		case 1:
			System.out.println("Balance: " + balance); 
			System.out.println(); break;
		case 2: 
			System.out.println("Enter new PIN;");
			PIN = myScanner.nextInt(); 
			System.out.println(); break;
		case 3:
			System.out.println("How much money do you want to deposit?");
			balance += myScanner.nextDouble(); 
			System.out.println("New balance: " + balance); 
			System.out.println(); break;
		case 4:
			System.out.println("How much money do you want to withdrawl?");
			withdraw = myScanner.nextDouble();
			if(withdraw>balance){
				System.out.println("Sorry, you don't have that much money");
			} else{
				balance -= withdraw;
			System.out.println("New balance: " + balance);} 
			System.out.println(); break; 
		case 5: 
			System.out.println("Thank you for using Citibank.");
			count = 5; break; }
		} while (option != 5); 
		
			} else {
				System.out.println("Invalid PIN."); 
				count++;}
		} while (count <3);
	System.out.println("Sorry, you ran out of tries.");
	
	
	
}
}






/*import java.util.Scanner;

public class Class4Atm {
	public static void main(String[]args){
		
	Scanner scan = new Scanner(System.in);
	
	int Pin = 1449;
	int userPin;
	int option;
	int balance = 50;
	double withdrawl;
	int count = 0;
	
	System.out.println("Welcome to your bank account");
	do{
		System.out.println("Please enter your pin number");
		userPin = scan.nextInt();
	
	if (userPin == PIN) {
		do{
			System.out.println("Welcome to your account");
			System.out.println("Chose an option");
			System.out.println("option 1");
			System.out.println("Option 2");
			System.out.println("Option 3");
			System.out.println("Option 4");
			System.out.println("Option 5");
			option = scan.nextInt();
			switch(option){
			case 1:
				System.out.println("Balance: " + balance);
				System.out.println();break;
			case 2:
				System.out.println("Enter new pin:");
				Pin = scan.nextInt();
				System.out.println();break;
			case 3:
				System.out.println("How much money do you want to deposit?");
				balance += scan.nextDouble();
				System.out.println("New Balance: "+ balance);
				Pin = scan.nextInt();
				System.out.println();break;
			case 4:
				System.out.println("How much money do you want to withdraw?");
				withdrawl = scan.nextDouble();
				while (withdrawl > balance){
				System.out.println("You have insuficent funds");
				}
				System.out.println("New Balance: "+ balance);
				Pin = scan.nextInt();
				System.out.println();break;
			case 5:
				System.out.println("Thank you for your money");
				count = 5;
				System.out.println();break;
			}while (option !=5) 
			
		     } else {
				System.out.println("Invalid Pin.");
				count++: }
			} while ( count <3);
			System.out.println("Sorry, you ran out of atempts");
				
		}
		
	}
	
	}
}
*/