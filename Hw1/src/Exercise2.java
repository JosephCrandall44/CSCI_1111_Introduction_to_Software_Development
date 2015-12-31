import java.util.Scanner;
public class Exercise2 {
public static void main(String[]args){
	double g = 0;
	double cost = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println ("This program calculates the cost of N gallons of Gasonline if one liter of gasoline costs $1.50");
	System.out.println ("Please enter the number of gallons");
	g = scan.nextDouble();
	
	
	cost = ( g * 5.6775 );
	
	double roundOff = Math.round(cost * 100.0) / 100.0;

	System.out.println ("Your mean grade is " + roundOff);
}
}
