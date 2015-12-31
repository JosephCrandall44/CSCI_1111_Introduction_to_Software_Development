import java.util.Scanner;

public class AnnualInterest {

	public static void main(String[] args) {
		double Balance;
		double AnnualInterstRate;
		double BalanceAfterOneYear;
		double Interst;
		System.out.println("Interst Calculaiton Program");
		System.out.println("Enter the Starting Balance: ");
		Scanner myScanner = new Scanner(System.in);
		Balance = myScanner.nextDouble();
		System.out.println("Enter the Annual Interst Rate: ");
		AnnualInterstRate = myScanner.nextDouble();
		myScanner.close();
		Interst = (Balance * (AnnualInterstRate/100));
		BalanceAfterOneYear = (Balance + Interst );
		System.out.println("Balance After One Year is " + BalanceAfterOneYear);
	}
}

