import java.util.Scanner;

public class Class1 {

	private static Scanner newScan;

	public static void main(String[] args) {
		int n = 0;
		int i = 0;

		System.out.println("Enter an Integer");
		newScan = new Scanner(System.in);
		n = newScan.nextInt();

		for (i = 1; i <= n; i++) {
			if(i%2 == 0){
				System.out.println(i);

			}
		}

	}

}
