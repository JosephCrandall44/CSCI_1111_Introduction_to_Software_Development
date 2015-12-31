import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		double sum = 0;
		double grade;
		
		int[] guess = new int[5];
		
		System.out.println("This program will test your math skills");
		Scanner scan = new Scanner(System.in);;
		System.out.println("What is 1+7");
		guess [0] = scan.nextInt();
		System.out.println("What is 1-6");
		guess [1]  = scan.nextInt();
		System.out.println("What is 1*4");
		guess [2] = scan.nextInt();
		System.out.println("What is 1*0");
		guess [3] = scan.nextInt();
		System.out.println("What is 1+13");
		guess [4] = scan.nextInt();
		
		int[] answers = new int[5];
		answers[0] = 8;
		answers[1] = -5;
		answers[2] = 4;
		answers[3] = 0;
		answers[4] = 14;

		for (int i =0 ; i <= 4; i++){
			if (guess [i] == answers [i])
			{
				sum = sum + 1;
			}
		else{
			System.out.println (guess[i] + " is incorect, the correct answer is " + answers[i]);
			}
		}

	grade = (double)(sum / 5) *100;
	System.out.println ("Your grade is "+ grade + "%");
}
}