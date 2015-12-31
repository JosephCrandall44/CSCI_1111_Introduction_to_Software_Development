import java.util.Scanner;
public class Exercise1 {
public static void main(String[]args){
	double x = 0;
	double y = 0;
	double z = 0;
	double mean = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println ("This program calculates the mean of your first three exams");
	System.out.println ("Please enter your first exam grade");
	x = scan.nextDouble();
	System.out.println ("Please enter your second exam grade");
	y = scan.nextDouble();
	System.out.println ("Please enter your third exam grade");
	z = scan.nextDouble();
	mean = ( x + y + z ) / 3;
	
	double roundOff = Math.round(mean * 100.0) / 100.0;

	System.out.println ("Your mean grade is " + roundOff);
}
}
