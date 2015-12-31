import java.util.Scanner;
public class Exercise4 {
public static int sumDigit(int n){
	      int sum = n % 9;
	      if(sum == 0){
	          if(n > 0)
	               return 9;
	      }
	      return sum;   
	}
public static void main(String[]args){
	System.out.println ("imput a multiple diget integer");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double sum = sumDigit(n);
	System.out.println (sum);		
}
}

