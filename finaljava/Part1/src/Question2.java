
import java.util.Scanner;

public class Question2 {
	public static String NetID = "G3445596";
	public static String Password = "CS1111spring2014";
			
	public static void main(String[]args){
		boolean result;
		Scanner scan = new Scanner(System.in);
		System.out.println ("enter your NetID");
		String x = scan.next();
		System.out.println("enter your passWord");
		String y = scan.next();
		
		{if (x == NetID && y == Password){
			result = true ;
		}
		else{
			result = false;
		}
		}
		System.out.println(result);
	}
fix it
}
