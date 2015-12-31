import java.util.Scanner;
public class Exercise3 {
public static void main(String[]args){
	double x = 0;
	double y = 0;
	double hypotenuse;
	Scanner scan = new Scanner(System.in);
	System.out.println ("This program calculates the hypotenuse of a right triangle");
	System.out.println ("enter x");
	x = scan.nextDouble();
	System.out.println ("enter y");
	y = scan.nextDouble();
	
	hypotenuse = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));

	System.out.println ("The hypotenuse is " + hypotenuse);
}
}
