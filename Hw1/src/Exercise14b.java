import java.util.Scanner;
public class Exercise14b {

	private static Scanner newScan;

	public static void main(String[] args){
		int n;
		int i = 0;
		System.out.println("Enter an integer");
		newScan = new Scanner(System.in);
		n = newScan.nextInt();
		for (i = 0; i <= n ; i++){
			System.out.println(i);

		}
	}
}
