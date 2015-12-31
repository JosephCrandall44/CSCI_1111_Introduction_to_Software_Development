import java.util.Scanner;

public class Exercise1 {
	
	public static void displayFunds(double checking_balance){
		System.out.println("Display Funds");
		System.out.println("Current funds = " + checking_balance);
	}
	public static double withdrawFunds(double checking_balance){
		Scanner scan = new Scanner(System.in);
		System.out.println("Withdraw Funds");
		System.out.print("Amount to withdraw: ");
		double withdraw_amount = scan.nextDouble();
		if (withdraw_amount <= checking_balance) {
		    System.out.println("Withdraw successful");
		    checking_balance = checking_balance - withdraw_amount;
		    System.out.println("Current funds = " + checking_balance);
		} else {
		    System.out.println("Insufficient funds!");
		}
		return (double) checking_balance;
		}
	public static double transferFunds(double checking_balance){
		// NOTE: Incomplete, should be updated when support for savings is added.
		Scanner scan = new Scanner(System.in);		
		System.out.println("Transfer Funds (to savings)");
		System.out.print("Amount to transfer: ");
		double transfer_amount = scan.nextDouble();
		if (transfer_amount <= checking_balance) {
			System.out.println("Transfer successful");
			checking_balance = checking_balance - transfer_amount;
			System.out.println("Current funds = " + checking_balance);	
		} else {
		System.out.println("Insufficient funds!");
		
		}
		return (double) checking_balance;
	}
	public static double depositFunds(double checking_balance){
		Scanner scan = new Scanner(System.in);	
		System.out.println("Deposit Funds");
		System.out.print("Amount to deposit: ");
		double deposit_amount = scan.nextDouble();
		System.out.println("Deposit successful");
		checking_balance = checking_balance + deposit_amount;
		System.out.println("Current funds = " + checking_balance);
		return checking_balance;
	}
	public static boolean exitAtm(){
		boolean atm_on;
		System.out.println("Exit ATM Service");
		System.out.println("Thank you for using the SuperSecureBank ATM service.");
		atm_on = false;
		return atm_on;
	}
	public static void response(String customer_name){
		
		// Print welcome message
	    System.out.println("Welcome to SuperSecureBank ATM service!");
	    System.out.println("Hello " + customer_name + "!");

	    // request transaction type
	    System.out.println("What transaction would you like to perform?");
	    System.out.println("Options are:");
	    System.out.println("\t(1) display funds");
	    System.out.println("\t(2) withdraw funds");
	    System.out.println("\t(3) transfer funds (to savings)");
	    System.out.println("\t(4) deposit funds");
	    System.out.println("\t(5) exit ATM service");

	    
    } 
    public static void main(String args[]) {
    	boolean atm_on = true;
    	String customer_name = "Jane Doe";
    	double checking_balance = 513.87;
    	Scanner scan = new Scanner(System.in);
    	while (atm_on){
    		response(customer_name);
    		
    		int response = scan.nextInt();

    	    if (response == 1){
    	    	displayFunds(checking_balance);
    	    }
    	    else if (response == 2){
    	    	checking_balance = withdrawFunds(checking_balance);
    	    }
    	    else if (response == 3){
    	    	checking_balance = transferFunds(checking_balance);
    	    }
    	    else if (response == 4){
    	    	checking_balance = depositFunds(checking_balance);
    	    }
    	    else if (response == 5){
    	    	atm_on = exitAtm();
    	    }
    	    else{	
    	    		System.out.println("Incorrect option selection.");
    	    }
    	    
    	    if (atm_on) {
    			System.out.println("Would you like to perform another transaction? (1: yes, 2: no)");
    			response = scan.nextInt();
    			if (response == 1) {
    			    // No need to do anything
    			} else if (response == 2) {
    			    System.out.println("Exit ATM Service");
    			    System.out.println("Thank you for using the SuperSecureBank ATM service.");
    			    atm_on = false;
    			} else {
    			    System.out.println("Incorrect option selection.");
    			}
    		    }
    		
    	}
    }

}
    	
