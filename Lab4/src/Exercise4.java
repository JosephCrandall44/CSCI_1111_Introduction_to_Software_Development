import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] agrs) {

		boolean gender;
		System.out.println("Enter M or F for Male of Female");
		Scanner myScanner = new Scanner(System.in);
		gender = myScanner.nextBoolean();
		myScanner.close();

		int major;
		System.out.println("Please enter your majors code"
				+ "If computer Science then 0"
				+ "If Electrical Engineering then 1"
				+ "If Mechnical Engineering then 2"
				+ "If Computer Engineering then 3");
		major = myScanner.nextInt();
		if ((major == 0 || major == 3) && gender == true) {
			System.out.print("you can be honored to be a member  of WICS Orgnaization");

		}
	}

}
