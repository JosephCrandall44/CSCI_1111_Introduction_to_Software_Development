import java.util.Scanner;
public class Exercise4 {
public static int countsDigits(int n){
	
	int length = String.valueOf(n).length();
	
	return length;
	
}
public static void main(String[]args){
	System.out.println("This prgram will count the number digits in a number");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int answer = countsDigits(n);
	System.out.println("The number of digits is " + answer);
	
}
}

