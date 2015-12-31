import java.util.Scanner;
public class Exercise14cEven {

	private static Scanner newScan;

	public static void main(String[] args){
		int n;
		int i = 0;
		System.out.println("Enter an integer");
		newScan = new Scanner(System.in);
		n = newScan.nextInt();
		for (i = 2; i <= n ; i+=2){
			System.out.println(i);

		}
	}
}
