import java.util.Scanner;
public class Class1 {
 public static void main(String[]args){
	 int n = 0;
	 int count;
	 int x;
	 int product = 0;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("how many numbers are you scanning");
	 n = scan.nextInt();
	 
	 for (count = 0; count < n ; count++){
	 	
		 	System.out.print("enter your number");
	 		x = scan.nextInt();
		 
	 	if(count != 1 && count != n -1 ){
	 		product = product * x;
	 		
	 	}
	 }
	 System.out.println("The product is " + product);
	 }
}