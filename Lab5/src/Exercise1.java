import java.util.Scanner;
public class Exercise1 {
	public static void main(String[]args){
		System.out.println("Enter and integer between 1 and 10 and this program will convert it into writing");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		switch (number){
		case 1:
			System.out.println ("One");
			break;
		case 2:
			System.out.println ("Two");
			break;
		case 3:
			System.out.println ("Three");
			break;
		case 4:
			System.out.println ("Four");
			break;
		case 5:
			System.out.println ("Five");
			break;
		case 6:
			System.out.println ("Six");
			break;
		case 7:
			System.out.println ("Seven");
			break;
		case 8:
			System.out.println ("Eight");
			break;
		case 9:
			System.out.println ("Nine");
			break;
		case 10:
			System.out.println ("Ten");
		default: 
			System.out.println ("You did not enter an integer between one and ten");
        break;
		}
	}
}
