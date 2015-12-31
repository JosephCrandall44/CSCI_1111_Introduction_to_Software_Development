import java.util.Scanner;
public class PrintNumbers {
	public static void main(String[]args){
		int number = 0;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		for(int i = 0; i <= number; i++){
			System.out.println(i);
		}
	}

}
