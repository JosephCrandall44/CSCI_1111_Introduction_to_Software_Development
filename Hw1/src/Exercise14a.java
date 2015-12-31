import java.util.Scanner;
public class Exercise14a {

	private static Scanner newScan;

	public static void main(String[] args){
		int n;
		int i = 0;
		System.out.println("Enter an integer");
		newScan = new Scanner(System.in);
		n = newScan.nextInt();
		
		while (i <= n){
			System.out.println(i);
			i++;
		}
	}
}

