import java.util.Scanner;
public class Exercise13 {
public static void main(String[] args){ 
	
	Scanner myScanner = new Scanner(System.in);
	
	
	int PIN = 12345; 
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
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			break;
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